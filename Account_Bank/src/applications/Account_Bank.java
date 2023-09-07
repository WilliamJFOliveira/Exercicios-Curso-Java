package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Account_Bank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int Number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?" );
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double inicialDeposit = sc.nextDouble();
			account = new Account(Number, holder, inicialDeposit);
		}
		else {
			account = new Account(Number, holder);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.print(account);
		
		System.out.println();
		System.out.print("Enter a deposit value:");
		double depositvalue = sc.nextDouble();
		account.deposit(depositvalue);
		System.out.println("Update account data:");
		System.out.print(account);
		
		System.out.print("Enter a withdraw value:");
		double withdrawvalue = sc.nextDouble();
		account.withdraw(withdrawvalue);
		System.out.println("Update account data:");
		System.out.print(account);
		sc.close();

	}

}
