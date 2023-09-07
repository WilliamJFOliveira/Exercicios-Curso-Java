package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Exercicio_Lista_Funcionarios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> funcio = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			System.out.println();
			System.out.printf("Emplyoee #"+i+":\n");
			
			System.out.print("ID: ");
			int id = sc.nextInt();
			while (hasId(funcio, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
				
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			funcio.add(new Funcionarios(id, name, salary));
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase :");
		int id = sc.nextInt();
		Funcionarios emp = funcio.stream().filter(x -> x.getId()== id).findFirst().orElse(null);
		if(emp == null) {
			System.out.print("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage:");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		System.out.println();
		System.out.println("List of employees:");
		for(Funcionarios obj : funcio) {
			System.out.println(obj);
		}
		sc.close();
	}

	private static boolean hasId(List<Funcionarios> funcio, int id) {
		Funcionarios emp = funcio.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
