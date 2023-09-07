package entities;

public class Bank_Savings_Account extends Bank_Account {

	private Double interestRate;
	
	public Bank_Savings_Account() {
		super();
	}

	public Bank_Savings_Account(Integer number, String holder, Double balance, Double interestingRate) {
		super(number, holder, balance);
		this.interestRate = interestingRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public void updateBalance() {
		balance += balance * interestRate;
	}
	@Override
	public void withdraw (double amount) {
		balance -= amount;
	}
}
