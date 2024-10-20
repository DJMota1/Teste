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
		
	protected void createSymp(String na, String de) {
		System.out.println(sessionFactory);
		Symptom symptom = new Symptom();
		System.out.println(symptom);
		symptom.setName(na);
		symptom.setDescr(de);
		System.out.println(symptom);
		System.out.println(sessionFactory);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.persist(symptom);
		
		session.getTransaction().commit();
		session.close();
	
		
	}
	
	protected void readSymp() {
		
	}
	
	protected void updateSymp() {
		
	}
	
	protected void deleteSymp() {
		
	}

	@Override
	public String toString() {
		return "STDPMan [sessionFactory=" + sessionFactory + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
}
	
	
