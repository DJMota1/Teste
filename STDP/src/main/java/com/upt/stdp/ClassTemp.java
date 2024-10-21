package com.upt.stdp;

import java.io.IOException;
import java.io.InputStream;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class ClassTemp {
	private int n;
	private int o;
	public ClassTemp()
	{
		
	}
	public void test()
	{
		InputStream configStream = this.getClass().getClassLoader().getResourceAsStream("hibernate.cfg.xml");
		if (configStream == null) {
		    System.out.println("hibernate.cfg.xml not found in classpath");
		} else {
		    System.out.println("hibernate.cfg.xml loaded successfully");
		}
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getO() {
		return o;
	}
	public void setO(int o) {
		this.o = o;
	}
}
