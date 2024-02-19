package main;
import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holderName = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)? ");
		char initialDepositAnswer = sc.next().charAt(0);
		
		if(initialDepositAnswer == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, holderName, initialDeposit);
		} else {
	        account = new Account(accountNumber, holderName);
	    }
		
		System.out.println("");
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println("");
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println("");
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);	
		
		sc.close();

	}
}
