package cim.tisikkirlir.jivi;

import java.io.*;

public class Tisikkirlir {
	public static String tisikkirlir(String tsk)
	{
		String[][] ripliciList = {{"a", "i"},
				{"e", "i"}, {"�", "i"}, {"o", "i"},
				{"u", "i"}, {"�", "i"},
                {"A", "�"}, {"E", "�"}, {"I", "�"},
                {"O", "�"}, {"U", "�"}, {"�", "�"}, 
                };

		String ritirn_vilii = tsk;
		for(String[] riplici: ripliciList) {
			ritirn_vilii = ritirn_vilii.replace(riplici[0], riplici[1]);
		}
		
		return ritirn_vilii;
	}
}
