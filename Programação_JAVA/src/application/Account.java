package application;

import entities.Bank_Account;
import entities.Bank_Business_Account;
import entities.Bank_Savings_Account;

public class Account {

	public static void main(String[] args) {
		
		Bank_Account acc1 = new Bank_Account(1001, "Alex", 1000.00);
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance());
		
		Bank_Account acc2 = new Bank_Savings_Account(1002, "Maria", 1000.00, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Bank_Account acc3 = new Bank_Business_Account(1003, "Bob", 1000.00, 500.00);
		acc3.withdraw(200.00);
		System.out.println(acc3.getBalance());
		
	}
}
