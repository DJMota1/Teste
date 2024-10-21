package com.upt.stdp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class STDPMan {
	protected SessionFactory sessionFactory;
	
	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		System.out.println(registry);
		try 
		{
			System.out.println(registry);
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			System.out.println(sessionFactory);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}
	
	protected void exit() {
		if (sessionFactory != null)
		{
			sessionFactory.close();
		}
	}
		
	protected void createSymp(String name, String descr) {
		System.out.println(sessionFactory);
		Symptom symptom = new Symptom();
		System.out.println(symptom);
		symptom.setName(name);
		symptom.setDescr(descr);
		System.out.println(symptom);
		System.out.println(sessionFactory);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.persist(symptom);
		
		session.getTransaction().commit();
		session.close();
	
		
	}
	
	protected void readSymp(long n)
	{
		Session session = sessionFactory.openSession();
		
		Symptom symptom = session.get(Symptom.class, n);
		System.out.println("Sintoma" + symptom.getName());
		System.out.println("Descrição" + symptom.getDescr());
		
		session.close();
	}
	
	protected void updateSymp(long n,String na,String desc)
	{
		Symptom symptom= new Symptom();
		symptom.setId(n);
		symptom.setName(na);
		symptom.setDescr(desc);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.merge(symptom);
		
		session.getTransaction().commit();
		session.close();
	}
	
	protected void deleteSymp(long n)
	{
		Symptom symptom = new Symptom();
		symptom.setId(n);
		
		Session session= sessionFactory.openSession();
        session.beginTransaction();
		
		session.delete(symptom);
		
		session.getTransaction().commit();
		session.close();
		
	}
	//protected void createTemp(int o)
	{
		//		ClassTemp n1 = new ClassTemp();
		//n1.setO(o);
		
		//Session session = sessionFactory.openSession();
		//session.beginTransaction();
		
		//	session.persist(n1);
		
		//session.getTransaction().commit();
		//session.close();
	}

	@Override
	public String toString() {
		return "STDPMan [sessionFactory=" + sessionFactory + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
}
	
	
