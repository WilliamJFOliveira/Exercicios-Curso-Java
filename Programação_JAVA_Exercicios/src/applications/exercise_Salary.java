package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class exercise_Salary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		emp.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee:" + emp);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.print("Update data: "+ emp);
		
		sc.close();

	}

}
