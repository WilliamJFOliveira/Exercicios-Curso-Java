package model.entities;

import model.exception.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdraLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdraLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdraLimit = withdraLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdraLimit() {
		return withdraLimit;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void setWithdraLimit(Double withdraLimit) {
		this.withdraLimit = withdraLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		validateWitchdraw(amount);
		balance -= amount;
	}
	
	private void validateWitchdraw(double amount){
		if(amount > getWithdraLimit()) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if(amount > getBalance()) {
			throw new DomainException("Not enough balance");
		}
	}
	
	
	
}

