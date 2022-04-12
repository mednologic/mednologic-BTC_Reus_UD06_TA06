package Pr04;
/**
 * 
 * @author joseporiollopezbosch
 * BTC_Reus_UD06_TA06
 * Exercise04 - factorial
 */

import java.util.Scanner;

public class Exercise04App {

	public static void main(String[] args) {
		
		double resultado;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número para calcular su factorial");
		double fact = Double.parseDouble(scan.nextLine());
		scan.close();
		
		resultado = calcFactorial(fact);
		System.out.println("El factorial de "+(int)fact+" es: "+resultado);

	}
//Methods
	public static double calcFactorial(double num) {
		double result = num;
		
		//Multiplied by the antecesors with the exception of 0
		for (double i = 1; i<num ; i++) {
			result=result*i;
		}
		
		return result;
	}
}
