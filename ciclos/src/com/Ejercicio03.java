package com;
/*
 * PALINDROMO
 * 
 * 
 * ENTRADA: solicitar la palabra a verificar si es palindromo
 * 
 * 
 * PROCESO:	Convertir todo a minusculas
 * 			quitar espacios en blanco
 * 			realizar un recorrido en la palabra caracter por caracter de inicio a fin
 * 			la cual sera comparadad con un recorrido en la palabra de fin a inicio caracter 
 * 			por caracter 
 */
import java.util.Scanner;
public class Ejercicio03 {
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingrese la Palabra:");
	String palabra3 = teclado.nextLine();
	String palabra2 = palabra3.toLowerCase();
	String palabra1 = palabra2.replaceAll(" ","");
	
	//System.out.println(palabra1);
	
	int i =0;
	int j = palabra1.length()-1;
	boolean band = true;
	
	for(i=0; i< palabra1.length();i++) {
		
		char letra1=palabra1.charAt(i);
		char letra2=palabra1.charAt(j);
		
		if(letra1==letra2){
			j--;
		}else {
			System.out.println("Esta palabra NO es un palindromo");
			i = palabra1.length();
			band=false;
		}
	}
	
	if (band==true) {
		System.out.println("Esta palabra es palindromo");
	}
}
}

	
