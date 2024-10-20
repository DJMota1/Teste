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
		sTDPMan.createSymp("Fadiga", "Cansaço agudo e prolongado.");
		sTDPMan.exit();
		System.out.println(sTDPMan);
	}

}
