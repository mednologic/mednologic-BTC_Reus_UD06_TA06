package Pr08;

/**
 * 
 * @author joseporiollopezbosch
 * BTC_Reus_UD06_TA06
 * Exercise08 - Array
 */

import java.util.Scanner;

public class Exercise08App {
	
	static Scanner scan = new Scanner (System.in);
	static int numerosA [] = new int [10];

	public static void main(String[] args) {
		
		rellenarArray();

	}
//Methods
	
	//Fitting the array
	public static void rellenarArray() {
		
		
		
		for(int i=0; i<numerosA.length; i++) {
			System.out.println("Introduce el número de la posición: "+(i+1));
			numerosA[i] = Integer.parseInt(scan.nextLine());
		}
		System.out.println("\n\nTodos los números han sido introducidos");
		mostrarArray();
	}
	//Showing the array
	public static void mostrarArray() {
		System.out.println("\n Mostrando array");
		for(int i=0; i<numerosA.length; i++) {
			System.out.println("Indice("+(i+1)+")-\t"+numerosA[i]);
		}
	}
}
