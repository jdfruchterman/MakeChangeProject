package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter cost of item: ");
		double cost = scanner.nextDouble();

		System.out.println("Please enter amount tendered: ");
		double tendered = scanner.nextDouble();

		int tenderedAltered;
		String change = "";

		if (tendered < cost) {
			System.out.println("That's not enough money.");
		}
		if (tendered == cost) {
			System.out.println("Exact change, no change owed.");
		} else if (tendered > cost) {
			int tenderedMagnified = (int) (tendered * 100);
			int costMagnified = (int) (cost * 100);
			tenderedAltered = tenderedMagnified - costMagnified;
//			System.out.println("tendered altered = " + tenderedAltered);
			if (tenderedAltered >= 4000) {
				int numberOfBills = tenderedAltered / 2000;
				change = change + numberOfBills + " Twenty Dollar Bills, ";
				tenderedAltered = tenderedAltered % 2000;
			}
//			System.out.println(tenderedAltered);
			if (tenderedAltered >= 2000 && tenderedAltered != 0) {
				int numberOfBills = tenderedAltered / 2000;
				change = change + numberOfBills + " Twenty Dollar Bill, ";
				tenderedAltered = tenderedAltered % 2000;
			}
//			System.out.println(tenderedAltered);
			if (tenderedAltered >= 2000) {
				int numberOfBills = tenderedAltered / 1000;
				change = change + numberOfBills + " Ten Dollar Bills, ";
				tenderedAltered = tenderedAltered % 1000;
			}
//			System.out.println(tenderedAltered);
			if (tenderedAltered >= 1000 && tenderedAltered != 0) {
				int numberOfBills = tenderedAltered / 1000;
				change = change + numberOfBills + " Ten Dollar Bill, ";
				tenderedAltered = tenderedAltered % 1000;
			}
//			System.out.println(tenderedAltered);
			if (tenderedAltered >= 500 && tenderedAltered != 0) {
				change = change + " 1 Five Dollar Bill, ";
				tenderedAltered = tenderedAltered % 500;
			}
//			System.out.println(tenderedAltered);
			if (tenderedAltered >= 200 && tenderedAltered != 0) {
				int numberOfBills = tenderedAltered / 100;
				change = change + numberOfBills + " One Dollar Bills, ";
				tenderedAltered = tenderedAltered % 100;
			}
//			System.out.println(tenderedAltered);
			if (tenderedAltered >= 100 && tenderedAltered != 0) {
				int numberOfBills = tenderedAltered / 100;
				change = change + numberOfBills + " One Dollar Bill, ";
				tenderedAltered = tenderedAltered % 100;
			}
//			System.out.println(tenderedAltered);
			if (tenderedAltered >= 50 && tenderedAltered != 0) {
				int numberOfBills = tenderedAltered / 25;
				change = change + numberOfBills + " Quarters, ";
				tenderedAltered = tenderedAltered % 25;
			}
//			System.out.println(tenderedAltered);
			if (tenderedAltered >= 25 && tenderedAltered != 0) {
				change = change + " 1 Quarter, ";
				tenderedAltered = tenderedAltered % 25;
			}
//			System.out.println(tenderedAltered);
			if (tenderedAltered >= 20 && tenderedAltered != 0) {
				int numberOfBills = tenderedAltered / 10;
				change = change + numberOfBills + " Dimes, ";
				tenderedAltered = tenderedAltered % 10;
			}
//			System.out.println(tenderedAltered);
			if (tenderedAltered >= 10 && tenderedAltered != 0) {
				change = change + " 1 Dime, ";
				tenderedAltered = tenderedAltered % 10;
			}
//			System.out.println(tenderedAltered);
			if (tenderedAltered >= 5 && tenderedAltered != 0) {
				change = change + " 1 Nickel, ";
				tenderedAltered = tenderedAltered % 5;
			}
//			System.out.println(tenderedAltered);
			if (tenderedAltered >= 2 && tenderedAltered != 0) {
				int numberOfBills = tenderedAltered / 1;
				change = change + " and " + numberOfBills + " Pennies.";
				tenderedAltered = tenderedAltered % 1;
			} 
			else if (tenderedAltered >= 1 && tenderedAltered != 0) {
				change = change + " and 1 Penny.";
			}
			System.out.println(change);
		}
		scanner.close();
	}
}
