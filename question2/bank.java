package test.question2;

import java.util.Random;
import java.util.Scanner;



public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scn.next();
		System.out.println("Enter your birth details:");
		System.out.println("Enter the day");
		int day = scn.nextInt();
		System.out.println("Enter the month");
		int month = scn.nextInt();
		System.out.println("Enter the year");
		int year = scn.nextInt();
		System.out.println("Enter the nic");
		String nic = scn.next();
		System.out.println("Enter the balance with ehich you wan't to open the account");
		float balance = (float) scn.nextFloat();

		System.out.println("Press 1 to open a savings account and 2 for a current account");
		int choice = scn.nextInt();
		if (choice == 1) {
			System.out.println("Account successfully created with details as follows :");
			CurrentAccount ca = new CurrentAccount(name, day, month, year, nic, balance);
			System.out.println(ca);
		} else {
			System.out.println("Account successfully created with details as follows :");
			SavingsAccount sa = new SavingsAccount(name, day, month, year, nic, balance);
			System.out.println(sa);
		}

	}


}
