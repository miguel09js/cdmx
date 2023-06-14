package com;
/*
 * INVERSION AL AÑO
 * 
 * ENTRADA: el monto establecido en una variable
 * PROCESO:	se aplica un ciclo donde el monto del mes se obtiene del monto mas interes
 * 			repetir dicha operacion 12 veces correspondiente a los 12 meses del mes
 * SALIDA:	mostrar el resultado de la cantidad reinvirtida durante los 12 meses 
 *  
 */


import java.text.DecimalFormat;

public class Ejercicio06 {
public static void main(String[] args) {
	
	System.out.println("Si usted invierte $1000.00");
	double cantidad = 1000.00;
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	for(int i=0; i<12;i++) {
		cantidad = cantidad*1.02;
	}
	System.out.println("Interes de 2.0 % mensuales.");
	System.out.println("En un año obtendra : "+ df.format(cantidad));
}
}
