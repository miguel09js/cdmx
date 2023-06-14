package com;

import java.util.Formatter;

public class Principal {
public static void main(String[] args) {
	
	int numero = 5;

	Formatter fmt = new Formatter();
	fmt.format("%02d",numero);
		
	System.out.println("El numero formateado " + fmt);
}
}
