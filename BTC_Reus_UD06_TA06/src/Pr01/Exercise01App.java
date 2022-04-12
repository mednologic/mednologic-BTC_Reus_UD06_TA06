package Pr01;

/**
 * 
 * @author joseporiollopezbosch
 * BTC_Reus_UD06_TA06
 * Exercise01 - Càlculo de àreas 
 */

import java.util.Scanner;

public class Exercise01App {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static double resultado;

	public static void main(String[] args) {
		
		System.out.println("Introduzca que el tipo de figura del que quiere saber el àrea:\n\n"+
		"\tcirculo - cuadrado -triangulo");
		
		String figura = scan.nextLine();
		
		switch(figura.toLowerCase()) {
			case "circulo":
				resultado = areaCirculo();
				System.out.println("El àrea del círculo es: "+ resultado);
				break;
			case "cuadrado":
				resultado = areaCuadrado();
				System.out.println("El àrea del cuadrado es: "+ resultado);
				break;
			case "triangulo":
				resultado = areaTriangulo();
				System.out.println("El àrea del triangulo es: "+ resultado);
				break;
			default:
				System.out.println("Nombre de figura incorrecto");
				break;
		}
		scan.close();
	}
	
//Methods
	
	// Circle area calculation
	public static double areaCirculo() {
		double resul = 0;
		
		System.out.println("Introduce el valor de radio del círculo:");
		double radio = Float.parseFloat(scan.nextLine());
		
		resul = Math.pow(radio, 2)*Math.PI;
		
		return resul;
	}
	// Square area calculation, not rectangle
	public static double areaCuadrado() {
		double resul = 0;
		
		System.out.println("Introduce el valor del lado del cuadrado");
		double side = Float.parseFloat(scan.nextLine());
		
		resul = side*side;
		
		return resul;
	}
	// Triangle area calculation
	public static double areaTriangulo() {
		double resul = 0;
		
		System.out.println("Introduce el valor de la base del triangulo");
		double base = Float.parseFloat(scan.nextLine());
		
		System.out.println("Introduce el valor de la altura del triangulo");
		double height = Float.parseFloat(scan.nextLine());
		
		resul = (base*height)/2;
		return resul;
	}

}
