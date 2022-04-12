package Pr02;

/**
 * 
 * @author joseporiollopezbosch
 * BTC_Reus_UD06_TA06
 * Exercise02 - Números aleatorios 
 */

import java.util.Scanner;

public class Exercise02App {
	
	static int cantiNum, num1, num2;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("¿Cuantos números quieres generar ?");
		cantiNum = Integer.parseInt(scan.nextLine());
		
		//Range of numbers
		System.out.println("Rango de números\n ¿Cual és el primer número?");
		num1 = Integer.parseInt(scan.nextLine());
		System.out.println("¿Cual és el número máximo?\n");
		num2 = Integer.parseInt(scan.nextLine());
		
		for(int i=0; i<cantiNum; i++) {
			int newNum = generacionNumAleatorios(num1, num2);
			System.out.println(newNum);
		}
		scan.close();
	}
//Methods
	public static int generacionNumAleatorios(int num1, int num2) {
		int result = 0;
		result=(int) Math.round(Math.random()*((num2+1)-num1)+num1);
		
		return result;
	}

}
