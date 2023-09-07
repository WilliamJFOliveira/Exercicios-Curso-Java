package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.reg_Pensionato;

public class Pensionato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		reg_Pensionato[] vagas = new reg_Pensionato[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++ ) {
			System.out.printf("Rent #"+i+":\n");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vagas[room] = new reg_Pensionato(name, email);
		
		}
		System.out.println();
		System.out.println("Busy rooms");
		for(int i=0; i<10; i++ ) {
			if(vagas[i] != null) {
				System.out.println(i + ": "+ vagas[i]);
			}
		}
		sc.close();

	}

}
