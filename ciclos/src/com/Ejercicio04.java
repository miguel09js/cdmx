package com;

/*
 * cuántas veces existe una letra dentro de la frase
 * 
 * ENTRADA:	se solicita la frase
 * 			se solicita la letra a buscar
 * 
 * PROCESO: recorre la frase letra por letra comparandola con la letra a buscar,
 * 			en caso de encontrarla llevamos un contador que nos ayudara a saber cuantas veces 
 * 			se repite.
 * 
 * SALIDA:	Mostarr la letra abuscar y el numero de veces qu ese encontro (contador)
 * 
 */
import java.util.Scanner;
public class Ejercicio04 {
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Escribe la frase:");
	String frase = teclado.nextLine();
	
	System.out.println("Teclea la letra a buscar");
	String letra = teclado.next();
	
	char x = letra.charAt(0);
	int tope= frase.length();
	int contador = 0;
	int i = 0;
	
	for (i=0; i<tope; i++) {
		char letra1 = frase.charAt(i);
		if(x==letra1) {
			contador++;
		}
	}
	if (contador > 0) {
		System.out.println("La letra "+ x + " se encontro "+ contador + " veces");
	}else {
		System.out.println("*** Carácter no encontrado ***");
	}
}
}
