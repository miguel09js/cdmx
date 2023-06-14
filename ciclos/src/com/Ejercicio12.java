package com;

/*
 * Se ingresan un conjunto de n edades de personas por teclado. 
 * El programa finalizara cuando el promedio de las edades sea superior a 25
 * 
 * ENTRADA: se solicitan las edades
 * 
 * PROCESO: se inicia un ciclo con la condicion que termine al llegar al promedio establecido
 * 			se capturar las edades y se va realizando la sumatoria y division correspondiente
 * 			se compara si rebasa el limite establecido si no se continuan las iteraciones
 * SALIDA: 	se imprime las edades capturadas y el promedio para comprobar que ya 
 * 			se rebaso el limite
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio12 {
public static void main(String[] args) {
	boolean band = true;//solo para capturar el primero
	int i=0;
	double suma=0;
	double promedio=0;
	ArrayList<Integer> edades = new ArrayList<Integer>();
	Scanner teclado = new Scanner(System.in);
	
	do {
		System.out.println("Ingrese la edad:");
		edades.add(teclado.nextInt());
		
		if(band==true) {
			promedio=0;
			band=false;
		}else {
			promedio=0;
			suma=0;
			for(i=0;i<edades.size();i++) {
				suma=suma+edades.get(i);
			}
				promedio=suma/edades.size();
		}	
	}while(promedio<=25);
	
//	System.out.println(suma);
	System.out.println("El promedio es: "+ promedio);
	System.out.println("Las edades ingresadas son:");
	System.out.println(edades);
}
}
