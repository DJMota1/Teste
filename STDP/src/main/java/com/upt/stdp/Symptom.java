package com.upt.stdp;

import jakarta.persistence.*;

@Entity
@Table(name="symptom")
public class Symptom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private long id;
	@Column (name="name")
	private String name;
	@Column (name="descr")
	private String descr;
	
	
	/**
	 * 
	 */
	public Symptom() {
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	// ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String desc) {
		this.descr = desc;
	}

	@Override
	public String toString() {
		return "Symptom [id=" + id + ", name=" + name + ", desc=" + descr + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getDesc()=" + getDescr() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
