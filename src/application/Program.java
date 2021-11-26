package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Sergio", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Cecile", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Rossina", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Rita", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(400.0);
		
	}

}
