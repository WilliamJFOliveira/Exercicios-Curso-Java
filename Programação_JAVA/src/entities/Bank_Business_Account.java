package entities;

public class Bank_Business_Account extends Bank_Account{
	 
	private Double loanlimit;
	
	public Bank_Business_Account() {
	}

	public Bank_Business_Account(Integer number, String holder, Double balance, Double loanlimit) {
		super(number, holder, balance);
		this.loanlimit = loanlimit;
	}

	public Double getLoanlimit() {
		return loanlimit;
	}

	public void setLoanlimit(Double loanlimit) {
		this.loanlimit = loanlimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanlimit) {
			balance += amount - 10.0;
		}
	}
	public void withdraw (double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
