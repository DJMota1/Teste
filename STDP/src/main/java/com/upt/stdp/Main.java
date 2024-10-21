package com.upt.stdp;

import java.io.InputStream;

public class Main {
	public static void main (String[] args) 
	{
		ClassTemp classTemp= new ClassTemp();
		classTemp.test();
		STDPMan sTDPMan = new STDPMan();
		sTDPMan.setup();
		classTemp.test();
		String name = "Fadiga";
		String descr = "Cansaço agudo e prolongado.";
		sTDPMan.createSymp(name, descr);
//		int o = 0;
//	    sTDPMan.createTemp(o);
		sTDPMan.exit();
		System.out.println(sTDPMan);
	}

}
