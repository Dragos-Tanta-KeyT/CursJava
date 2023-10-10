package curs10;
/*
 * Vreau sa simulam un ATM cu urmatoarele operatiuni:
 * deposit
 * withdraw
 * check balanace
 * Trebuie sa intrebam userul ce operatiune vrea si la finalul 
 * operatiunii daca vrea sa continue
 * Luam in considerae ca pe viitor putem avea si alte tipuri de 
 * conturi asocitae acestui program
 * Implementarea se va face cu un cont curent
 * Avem exceptii pentru fonduri insuficiente si pentru sume invalide
 * 
 * 
 * o clasa parinte pentru conturi
 * o clasa pentru cont curent
 * 2 clase de exceptii 
 * 
 *  
 */

import java.util.Scanner;

public class BankApp {
	
	public boolean flag = false;
	
	public static void main(String[] args) {

		CurrentAccount account = new CurrentAccount(1000);
		BankApp app =  new BankApp();
		
		do {
			try {
				app.bankApp(account);
				//app.flag =false;
			} catch (InvalidAmountException e) {
				e.printStackTrace();
			} catch (InsuifficentFundsException e) {
				e.printStackTrace();
			}
			
			
		}while(app.flag);
		
	}
	
	public void bankApp(CurrentAccount account) throws InvalidAmountException, InsuifficentFundsException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi, Available operations are:");
		System.out.println("1 Deposit");
		System.out.println("2 Withdraw");
		System.out.println("3 Check balance");
		String option = scan.next();
		
		switch(option) {
		case "1":
			System.out.println("Please enter the amount to deposit:");
			double amount =  scan.nextDouble();
			account.deposit(amount);
			account.checkBalance();
			break;
		case "2":
			System.out.println("Please enter the amount to withdraw:");
			amount =  scan.nextDouble();
			account.withdraw(amount);
			account.checkBalance();
			break;
		case "3":
			account.checkBalance();
			break;
		default:
			System.out.println("Invalid option!");
		}
		
		System.out.println("Do you want to continue?");
		String answer = scan.next();
		if(answer.equalsIgnoreCase("yes")) {
			flag = true;
		}else {
			flag = false;
		}
		
	}

}
