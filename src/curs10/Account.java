package curs10;

public interface Account {

	public void deposit(double amount) throws InvalidAmountException;
	public void withdraw(double amount) throws InsuifficentFundsException;
	public void checkBalance();
	
}
