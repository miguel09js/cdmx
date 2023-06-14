package com;

/*
 * Tabla de multiplicar X
 * 
 * ENTRADA: Solicitar el numero de la tabla a multiplicar
 * 			Solicitar el numero de iteraciones a realizar
 * 
 * PROCESO:	Realizar el proceso de multiplicacion 
 * 
 * SALIDA: 	Mostrar el resultado.
 */
import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese que tabla de multiplicar desea:");
		int tabla = teclado.nextInt();
		System.out.println("Ingrese hasta que iteración desea:");
		int tope = teclado.nextInt();
		
		int i=1;
		
		while (i<=tope) {
			System.out.println(tabla+" x "+ i + " = " + (tabla*i));
			i++;
		}
	}
}
