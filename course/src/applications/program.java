package applications;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		double withdraw = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdraw);
		
		System.out.print("Enter amount for withdraw: ");
		withdraw =sc.nextDouble();
		
		try {
		account.withdraw(withdraw);
		System.out.printf("New balance: " + String.format("%.2f", account.getBalance()));
		}
		catch(DomainException e ) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		sc.close();
	}
}
		
		
		
	

	


