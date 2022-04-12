package Pr03;
/**
 * 
 * @author joseporiollopezbosch
 * BTC_Reus_UD06_TA06
 * Exercise03 - Numero primo
 */

import java.util.Scanner;

public class Exercise03App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		
		int num = Integer.parseInt(scan.nextLine());
		scan.close();
		
		if(comprNumPrimo(num)) {
			System.out.println("El número "+num+" es primo");
		}else {
			System.out.println("El número "+num+" no es primo");
		}
	}
//Methods
	//Check if its prime number
	public static boolean comprNumPrimo(int num) {
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
}
