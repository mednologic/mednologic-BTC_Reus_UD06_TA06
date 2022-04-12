package Pr11;

import java.util.Scanner;

/**
 * 
 * @author joseporiollopezbosch
 * BTC_Reus_UD06_TA06
 * Exercise11 - Arrays + pointer
 */

public class Exercise11App {
	
	static int arrayNum1 	[];
	static int arrayNum2 	[];
	static int arrayCalculo	[];
	static int arraySice ;
	static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {

		System.out.println("De que tamaño deseas los arrays?");
		arraySice 		= Integer.parseInt(scan.nextLine());
		arrayNum1 		= new int [arraySice];
		arrayCalculo 	= new int [arraySice];
		arrayNum2		= arrayNum1;
		
		rellenarArray();
		System.out.println("\nArray1 apuntando a array2");
		System.out.println("----------------------------------------------------------\n");
		mostrarArrays();
		System.out.println("Array2 reasignado");
		System.out.println("----------------------------------------------------------\n");
		reasignArray(arrayNum2);
		mostrarArrays();
		System.out.println("Array de Cálculo");
		System.out.println("----------------------------------------------------------\n");
		calculosArrays();
	}
	//Methods
		//Fitting the array with random numbers
		public static void rellenarArray() {
			
			for(int i=0; i<arrayNum1.length; i++) {
					arrayNum1[i] = (int) Math.round(Math.random()*10);		
			}
		}
		
		//Reallocating values of array
		public static void reasignArray(int array[]) {
			for(int i=0; i<arrayNum2.length; i++) {
				arrayNum2[i] = (int) Math.round(Math.random()*10);		
			}
		}
		
		//Printing arrays
		public static void mostrarArrays() {
			
			for(int i=0; i<arrayNum1.length; i++) {
				System.out.println("Indice Array1("+(i+1)+")-\t"+arrayNum1[i]);
			}
			System.out.println("\n");
			for(int i=0; i<arrayNum2.length; i++) {
				System.out.println("Indice Array2("+(i+1)+")-\t"+arrayNum2[i]);	
			}
			System.out.println("\n\n");
		}
		//Operations with arrays
		public static void calculosArrays() {
			//Both arrays have the same sice, then only one for is need it
			for(int i=0; i<arraySice;i++) {
				arrayCalculo[i] = arrayNum1[i] * arrayNum2[i];
				System.out.println("Indice ArrayCalculo("+(i+1)+")-\t"+arrayCalculo[i]);	
			}
		}
}
