package com;
/* NUMERO PARES ENTRE 2 NUMEROS
 * 
 * ENTRADA: solicitar 2 numeros
 * 
 * PROCESO: determinar cual numero es menor y mayor
 * 			ciclo que determine si el umero e par para poder imprimirlo
 * 
 * SALIDA: impresion del resultado
 * 
 */

import java.util.Scanner;
public class Ejercicio09 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int mayor = 0;
	int menor = 0;
	int residuo = 0;
	boolean band=true;
	
	System.out.println("Capture el primer n�mero:");
	int num1 = teclado.nextInt();
	System.out.println("Capture el segundo n�mero:");
	int num2 = teclado.nextInt();

	if(num1==num2) {
		System.out.println("se ingreso el mismo n�mero");
		band=false;
	}else if (num1>num2) {
		mayor = num1;
		menor = num2;
	}else {
		mayor = num2;
		menor = num1;
	}
	
	if(band==true) {
		System.out.println("N�meros pares entre los datos ingresados:");
		for(int i=menor; i<=mayor; i++) {
			residuo = i%2;
			if(residuo == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

}
}
