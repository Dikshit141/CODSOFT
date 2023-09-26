package ATMInterface;

import java.util.Scanner;

class financial{
	private double balance;
	
	public financial(double initialBalance) {
		balance = initialBalance;
	}
	
	public double displayBalance() {
		return balance;
	}
	
	public void depositAmount(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
}

class solution{
	private financial financial;
	private Scanner scanner;
	
	public solution(financial financial) {
		this.financial = financial;
		scanner = new Scanner(System.in);
	}
	
	public void run() {
		while(true) {
			displayMenu();
			int choice = getUserChoice();
			
			switch(choice) {
			case 1:
				withdrawAmount();
				break;
			case 2:
				depositAmount();
				break;
			case 3:
				checkBalance();
				break;
			case 4:
				System.out.println("thank you for using the software");
				return;
			default:
				System.out.println("Wrong Entry, Please Try Again!!");
				break;
			}
		}
	}
	
	private void displayMenu() {
		System.out.println("ATM menu:");
		System.out.println("1. withdrawAmount");
		System.out.println("2. depositAmount");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit Menu");
	}
	
	private int getUserChoice() {
		System.out.println("Enter your option: ");
		return scanner.nextInt();
	}
	
	private void withdrawAmount() {
		System.out.println("Enter amount: ");
		double amount = scanner.nextDouble();
		if(amount <= 0) {
			System.out.println("Wrong Entry, Please try again !!");
			return;
		}
		
		if(amount > financial.displayBalance()) {
			System.out.println("Insufficient Balance, Please try Again!!");
			return;
		}
		
		financial.withdraw(amount);
		System.out.println("withdrawal of Rs." + amount + " successful.");
	}
	
	private void depositAmount() {
		System.out.println("Enter the amount to deposit: ");
		double amount = scanner.nextDouble();
		if(amount <= 0) {
			System.out.println("Wrong Amount!!");
			return;
		}
		financial.depositAmount(amount);
		System.out.println("Deposit of Rs." + amount + " successful.");
	}
	
	private void checkBalance() {
		double balance = financial.displayBalance();
		System.out.println("Current Balance is: Rs." + balance);
	}
}

public class atmInterface {
	public static void main(String[] args) {
		double initialBalance = 50000.0;
		financial financial = new financial(initialBalance);
		solution solution = new solution(financial);
		solution.run();
	}
}
