package entities;

public class Account {

	private int Number;
	private String holder;
	private double balance;

	public Account(int Number, String holder, double inicialDeposit) {
		this.Number = Number;
		this.holder = holder;
		deposit (inicialDeposit);
	}

	public Account(int number, String holder) {
		this.Number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return Number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		 this.balance += amount;
	}

	public void withdraw (double amount) {
		this.balance -= amount + 5.0;
	}
	public String toString() {
		return "Account "
			+ Number
			+ ", Holder: "
			+ holder
			+", Balance: $ "
			+ String.format("%.2f%n",balance);
	}
}
