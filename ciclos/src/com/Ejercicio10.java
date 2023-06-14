package com;

/*
 * 	Programa que lea 20 números e indique si son positivos o negativos y pares o impares 
 * 	y ademas muestre la sumatoria de los positivos y sumatoria de los impares
 * 
 * ENTRADA: ciclo que capture 20 numeros
 * PROCESO: determinar si es par
 * 			determinar si es positivo o negativo
 * 			realizar la sumatoria  correspondientes segun el caso en una variable correspondiente
 * SALIDAD:	imprimir el resultado de sumatorias segun sea el caso
 */

import java.util.Scanner;
public class Ejercicio10 {
public static void main(String[] args) {
	
	int tope=20;
	int residuo = 0;
	int [] datos = new int[tope];
	String signo ="";
	String parImpar="";
	int sumaPos = 0;
	int sumaImpar = 0;
	
	
	Scanner teclado = new Scanner(System.in);
	
	for(int i=0; i<tope;i++) {
		datos[i] = teclado.nextInt();
	}

	for(int i=0; i<tope;i++) {
		
		residuo = datos[i]%2;
		if(residuo==0) {
			parImpar = " par";
		}else {
			parImpar = " impar";
			sumaImpar += datos[i];
		}
		
		if(datos[i]<0) {
			signo = " negativo";
		}else {
			signo = " positivo";
			sumaPos += datos[i];
		}
		
		System.out.println(datos[i]+" Número\t" + signo + parImpar);
	}
	System.out.println("La suma de los números positivos es: "+ sumaPos);
	System.out.println("La suma de los números impares es: "+ sumaImpar);
}
}
