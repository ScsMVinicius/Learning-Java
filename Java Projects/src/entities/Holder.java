package entities;

public class Holder {

	private int accountNumber;
	String name;
	private double balance;

	public Holder(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		balance += value;
	}

	public void withdraw(double value) {
		balance -= value + 5;
	}

	public String toString() {
		return "Account " + 
				accountNumber +
				", Holder: " + 
				name + 
				", Balance : $ " +
				balance;
	}
}
