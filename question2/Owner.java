package test.question2;
 public class Owner {
	private String name;
	private Date dob;
	private String nic;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Owner() {

	}

	public Date getDOB() {
		return this.dob;
	}

	public Owner(int day, int month, int year, String name, String nic) {
		super();
		this.name = name;
		this.nic = nic;
		this.dob = new Date(day, month, year);
	}

	public Owner(Owner o) {
		this.dob = o.getDOB();
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	@Override
	public String toString() {

		return "\nname :" + this.name + "\nnic :" + this.nic + "\ndob :" + this.getDOB();
	}
}
