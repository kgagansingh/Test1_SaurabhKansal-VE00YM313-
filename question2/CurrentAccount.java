package test.question2;

public class CurrentAccount extends Account {
	final int charges = 1000;
	private float minimumBalance = 100;

	public CurrentAccount() {
	}

	public CurrentAccount(String name, int day, int month, int year, String nic, float balance) {
		super(name, day, month, year, nic, balance);
		this.minimumBalance = minimumBalance;
	}

	public float getCharges() {
		return charges;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nCurrentAccount with minimum balance " + this.minimumBalance;
	}
}
