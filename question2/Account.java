package test.question2;

import java.util.Random;

public class Account {
	private Owner owner;
	private float balance;
	Random rand = new Random();
	private String number = 10000 + rand.nextInt(89999) + "";

	public Account() {
	}

	public Account(String name, int day, int month, int year, String nic, float balance) {
		this.owner = new Owner(day, month, year, name, nic);
		this.balance = balance;
	}

	public Account(Account account) {
		this.owner = account.owner;
		this.balance = account.balance;
		this.number = account.number;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		return owner + "\nbalance :" + balance + "\nAccount Number :" + number;
	}

	public void deposit(float amt) {
		this.balance += amt;
	}

	public void withdraw(float amt) {
		this.balance -= amt;
	}

	public float getBalance() {
		float bal = balance;
		return bal;
	}
}
