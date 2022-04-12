package Pr12;

import java.util.Scanner;

/**
 * 
 * @author joseporiollopezbosch
 * BTC_Reus_UD06_TA06
 * Exercise12 - Arrays + digito final
 */

import java.util.Scanner;

public class Exercise12App {
	
	static Scanner scan = new Scanner (System.in);
	static int arrayNum[];
	static int digito;

	public static void main(String[] args) {
		
		System.out.println("De que tamaño deseas los arrays?");
		arrayNum 		= new int [Integer.parseInt(scan.nextLine())];
		
		rellenarArray();
		mostrarArrays();
		boolean flag=false;
		
		do {
			try {
				
				System.out.println("De que digito quieres buscar?");
				digito = Integer.parseInt(scan.nextLine());
				scan.close();
				flag = comprobarDigito(digito);
				
			}catch(Exception e) {
				System.out.println("Digito incorrecto");
			}
			
		}while(!flag);
		
		//search for the digit on the array
		for(int i=0; i<arrayNum.length; i++) {
			//Convert and set last position
			char temp = Integer.toString(arrayNum[i]).charAt(Integer.toString(arrayNum[i]).length()-1);
			
			//Compare and print
			if(temp == Integer.toString(digito).charAt(0)) {
				System.out.println(arrayNum[i]);
			}
		}

	}
	
//Methods
	//Fitting the array with random numbers
	public static void rellenarArray() {
		
		for(int i=0; i<arrayNum.length; i++) {
				arrayNum[i] = (int) Math.floor(Math.random()*300+1);		
		}
	}
	
	//Check if its a digit
	public static boolean comprobarDigito (int num) {
		boolean result=false;
		String temp = Integer.toString(num);
		
		//Chech the digit
		for(int i=0; i<=9; i++) {
			if(temp.equals(Integer.toString(i))) {
				result = true;
			}
		}
		//Message of error
		if(!result) {
			System.out.println("Digito incorrecto");
		}
		return result;
	}
//Printing arrays
	public static void mostrarArrays() {
		
		for(int i=0; i<arrayNum.length; i++) {
			System.out.println("Indice Array1("+(i+1)+")-\t"+arrayNum[i]);
		}

	}
}
