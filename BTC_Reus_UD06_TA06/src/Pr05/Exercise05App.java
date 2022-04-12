package Pr05;

/**
 * 
 * @author joseporiollopezbosch
 * BTC_Reus_UD06_TA06
 * Exercise05 - Decimal a binario
 */

import java.util.Scanner;

public class Exercise05App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String binario="";
		
		System.out.println("Introduce un numero para transformar a binario");
		int num = Integer.parseInt(scan.nextLine());
		scan.close();
		
		binario = converBinari(num);
		System.out.println("El binario de "+num+" es: "+binario);
		//Faster versión 
		System.out.println("Versión rápida "+Integer.toBinaryString(num));
	}
//Methods
	public static String converBinari(int num) {
		String result = "";
		int temp=num;
		
		//Logical to convert
		while (temp>0) {
			result = result.concat(Integer.toString(temp % 2));
			temp = temp / 2;
		}
		
		//inverting the String using an StringBuilder
		StringBuilder strB = new StringBuilder(result);
		result = strB.reverse().toString();
		return result;
	}
}
