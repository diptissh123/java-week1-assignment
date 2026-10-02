package bank_application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingApp {

	private BankAccount account;
	private Scanner scanner;
			
	public BankingApp() {
		account=new BankAccount();
		scanner=new Scanner(System.in);
		
	}
	public void start() {
		
		while(true) {
			System.out.println("\n======Banking Application=======");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Balance Inquiry");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			try {
				int choice =scanner.nextInt();
				
				switch(choice) {
				case 1:
					depositMoney();
					break;
					
				case 2:
					withdrawMoney();
					break;
				
				case 3:
					displayBalance();
					break;
					
				case 4:
					System.out.println("Thank you for using Banking Application");
					scanner.close();
					return;
				
				default:
					System.out.println("Invalid choice. please select 1 to 4.");
				}
			}catch(InputMismatchException e) {
				System.out.println("Invalid amount. please enter a numeric value.");
				scanner.nextLine();
			}
		}
		

	}
	private void depositMoney() {
		try {
			System.out.println("Enter deposit amount:");
			double amount= scanner.nextDouble();
			account.deposit(amount);
			displayBalance();
			
		}catch(InputMismatchException e) {
			System.out.println("Invalid amount. Please enter a numeric value");
			scanner.nextLine();
			
		}
	}
	
	private void withdrawMoney() {
		try {
			System.out.println("Enter withdrawal amount:");
			double amount =scanner.nextDouble();
			
			account.withdraw(amount);
			
			displayBalance();
			
			
			
			
			
		}catch(InputMismatchException e) {
			System.out.println("Invalid amount. Please enter a numeric value:");
			scanner.nextLine();
			
		}
		
	}
	
	private void displayBalance() {
		System.out.printf("Current Balance :%2f%n", account.getBalance());
	}
}
