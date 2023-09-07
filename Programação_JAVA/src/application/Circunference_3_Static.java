package application;

import java.util.Locale;
import java.util.Scanner;

import Util.Calculator_Static;



public class Circunference_3_Static {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius");
		double radius = sc.nextDouble();
		
		double c = Calculator_Static.circunference(radius);
		 
		double v = Calculator_Static.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", Calculator_Static.PI);
		
		sc.close();

	}

}
