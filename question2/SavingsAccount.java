package test.question2;

public class SavingsAccount extends Account {
	private float interestRate = 5;

	public SavingsAccount() {
	}

	public SavingsAccount(String name, int day, int month, int year, String nic, float balance) {
		super(name, day, month, year, nic, balance);
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {

		return super.toString() + "\nSavingsAccount with interest rate " + interestRate;
	}

	public float getInterest() {
		float interest = getBalance() * interestRate;
		return interest;
	}

}
