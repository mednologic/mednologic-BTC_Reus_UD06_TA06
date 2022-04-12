package Pr10;

import java.util.Scanner;

/**
 * 
 * @author joseporiollopezbosch
 * BTC_Reus_UD06_TA06
 * Exercise10 - Array con tamaño indicado por el usuario + números primos
 */

public class Exercise10App {
	
	static int arrayNum [];
	static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.println("De que tamaño deseas el array?");
		arrayNum = new int [Integer.parseInt(scan.nextLine())];
		rellenarArray();
		
	}
//Methods
	//Fitting the array with random numbers
	public static void rellenarArray() {
		
		for(int i=0; i<arrayNum.length; i++) {
			
			do {
				arrayNum[i] = (int) Math.round(Math.random()*10);
			}while(!comprobarNumPrimo(arrayNum[i]));
			
		}
		mostrarArray();
	}
	
	//Check if its prime number
	public static boolean comprobarNumPrimo(int num) {
		// 0,1,4 exceptions
		  if (num == 0 || num == 1 || num == 4) {
		    return false;
		  }
		  //if its divisible by the antesesors isnt prime
		  for (int x = 2; x < num / 2; x++) {

		    if (num % x == 0)
		      return false;
		  }
		  return true;
	}
	
	//Printing the array
	public static void mostrarArray() {
		int mayor=0;
		for(int i=0; i<arrayNum.length; i++) {
			System.out.println("Indice("+(i+1)+")-\t"+arrayNum[i]);
			if(arrayNum[i]>mayor) {
				mayor = arrayNum[i];
			}
		}
		System.out.println("El número "+mayor+" es el mayor ");
	}
}
