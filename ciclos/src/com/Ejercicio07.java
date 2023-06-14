package com;
/*
 * INTERESES HASTA MONTO MAXIMO
 * 
 * ENTRADA:	monto  inicial ya establecido
 * 
 * PROCESO: ciclo donde el monto acumulado es igual al monto mas intereses
 * 			el ciclo termina cuando el mono rebasa la cantidad a la que se quiere llegar
 * 
 * SALIDAD: imprimir el numero de iteraciones que se realizo pra llegar a ese monto
 */

import java.text.DecimalFormat;

public class Ejercicio07 {
public static void main(String[] args) {
	
	System.out.println("Si usted invierte $700.00");
	double cantidad = 700.00;
	int meses = 0;
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	while(cantidad<1500) {
		cantidad = cantidad*1.02;
		meses++;
	}
		
	System.out.println("Interes de 2.0 % mensuales.");
	System.out.println("En "+ meses+" meses usted tendra");
	System.out.println("la cantidad de : $"+ df.format(cantidad));
	System.out.println("reinvirtiendo todo el dinero");
	
}
}
