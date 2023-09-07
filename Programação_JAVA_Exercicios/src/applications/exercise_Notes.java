package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Notes;

public class exercise_Notes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notes not = new Notes();
		
		System.out.print("Entrade: ");
		not.name = sc.nextLine();
		not.noteT1 = sc.nextDouble();
		not.noteT2 = sc.nextDouble();
		not.noteT3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", not.finalGrade());
		
		if(not.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", not.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
		
	}

}