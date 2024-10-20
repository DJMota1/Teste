package com.upt.stdp;

import java.io.IOException;
import java.io.InputStream;

public class ClassTemp {
	private int n;
	public ClassTemp()
	{
		n=0;
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
}
