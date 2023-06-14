package com;

//Simular reloj Digital

import java.util.Formatter;
public class Ejercicio05 {
public static void main(String[] args) {
	
	int topems = 60;
	int topeh = 24;
	
	for (int i=0; i<topeh;i++) {
		Formatter hor = new Formatter();
		hor.format("%02d",i);
		
		for (int j=0; j< topems; j++) {
			Formatter min = new Formatter();
			min.format("%02d",j);
			
			for(int k=0; k<topems; k++) {
				Formatter seg = new Formatter();
				seg.format("%02d",k);
				System.out.println(hor+":"+min+":"+seg);
				
				try {
					Thread.sleep(10);
				}
				catch (Exception e) {
					
				}
			}
		}
	}
	
}
}
