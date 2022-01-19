package test.question2;

public class Date {
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	Date() {

	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date(Date d) {
		this.day = d.day;
		this.month = d.month;
		this.year = d.year;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + this.day + " , " + this.month + "," + this.year + ")";
	}
}