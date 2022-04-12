package Pr07;

/**
 * 
 * @author joseporiollopezbosch
 * BTC_Reus_UD06_TA06
 * Exercise07 - Conversor de monedas
 */

import java.util.Scanner;

public class Exercise07App {
	
	static Scanner scan = new Scanner(System.in);
	static int cantidad;
	static String moneda;

	public static void main(String[] args) {
		
		
		//Method to get the info
		inputInformacion();
		
	}

//Methods
	//Method to get the info
	private static void inputInformacion() {
		System.out.println("Introduce la cantidad de euros: ");
		cantidad = Integer.parseInt(scan.nextLine());
		
		System.out.println("Indica a que moneda lo quieres pasar: (Dollar, Yen, Libra)");
		moneda = scan.nextLine();
		//Call to method for conversion
		canvioDivisa(cantidad, moneda);
	}
	//Conversion or redirection to input
	public static void canvioDivisa(int cantidad, String moneda) {
		
		switch(moneda.toLowerCase()) {
		
		case "dollar":
			System.out.println(cantidad+ "euros = "+1.28611*cantidad+" "+moneda.toUpperCase());
			break;
		case "yen":
			System.out.println(cantidad+ "euros = "+129.852*cantidad+" "+moneda.toUpperCase());
			break;
		case "libra":
			System.out.println(cantidad+ "euros = "+0.86*cantidad+" "+moneda.toUpperCase());
			break;
		default:
			System.out.println("\nLa moneda no está en el sistema");
			inputInformacion();
			break;	
		}
		scan.close();
	}
}
