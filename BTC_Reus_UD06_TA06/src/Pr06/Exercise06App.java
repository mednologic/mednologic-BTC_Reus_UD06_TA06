package Pr06;

/**
 * 
 * @author joseporiollopezbosch
 * BTC_Reus_UD06_TA06
 * Exercise06 - Decimal a binario
 */

import java.util.Scanner;

public class Exercise06App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int resultado = 0;
		
		System.out.println("Introduce un número para saber cuantos digitos tiene");
		int num = Integer.parseInt(scan.nextLine());
		scan.close();
		
		resultado = countDigits(num);
		
		System.out.println("El número "+num+" tiene "+resultado+" dígitos");
	}
//Methods
	public static int countDigits(int num) {
		int result=0;
		
		//Parse to String and count the sice
		result = Integer.toString(num).length();
		
		//This exercise can be do it by many different ways, for example using for...
		
		return result;
		
		
	}
}
