package Pr09;

/**
 * 
 * @author joseporiollopezbosch
 * BTC_Reus_UD06_TA06
 * Exercise09 - Array con tamaño indicado por el usuario
 */

import java.util.Scanner;

public class Exercise09 {
	
	static int arrayNum [];
	static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.println("De que tamaño deseas el array?");
		arrayNum = new int [Integer.parseInt(scan.nextLine())];
		rellenarArray(0,9);
	}
//Methods
	//Fitting the array with random numbers
	public static void rellenarArray(int num1, int num2) {
		
		for(int i=0; i<arrayNum.length; i++) {
			arrayNum[i] = (int) Math.round(Math.random()*((num2+1)-num1)+num1);
		}
		mostrarArray();
	}
	//Printing the array
	public static void mostrarArray() {
		int suma = 0;
		for(int i=0; i<arrayNum.length; i++) {
			System.out.println("Indice("+(i+1)+")-\t"+arrayNum[i]);
			suma = suma+arrayNum[i];	
		}
		System.out.println("La suma de todos los números es: "+ suma);
	}
}
