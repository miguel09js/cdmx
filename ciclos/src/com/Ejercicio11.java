package com;
/*
 * Dibuja un cuadrado
 * 
 * ENTRADA: solicitar ancho y alto
 * 			solicitar caracter para dibujo
 * PROCESO:	ciclo que realice la impresion fila por fila con el caracter capturado.
 * SALIDA: impresion del resultado
 * 
 */
import java.util.Scanner;
public class Ejercicio11 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingrese el ancho:");
	int ancho = teclado.nextInt();
	System.out.println("Ingrese el alto:");
	int alto = teclado.nextInt();
	System.out.println("Ingrese el caracter a utilizar:");
	String car = teclado.next();
	System.out.println();
	
	for (int i=0; i<alto;i++) {//renglones
		for(int j=0;j<ancho;j++) {
			System.out.print(" "+car.charAt(0));// imprime columnas
		}
	System.out.println();
	}
	
}
}
