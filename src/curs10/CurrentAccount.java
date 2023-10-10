package curs10;

public class CurrentAccount implements Account {

	public double sold;
	
	public CurrentAccount(double sold) {
		this.sold = sold;
	}
	
	
	@Override
	public void deposit(double amount) throws InvalidAmountException {

		if(amount <= 0) {
			throw new InvalidAmountException(amount + " is not valid!");
		}
		sold = sold + amount;
		
	/*	if(amount >0) {
			sold = sold + amount;
		}else {
			throw new InvalidAmountException(amount + " is not valid!");
		}*/
		
	}

	@Override
	public void withdraw(double amount) throws InsuifficentFundsException {

		if(sold <amount) {
			throw new InsuifficentFundsException("You dont have sufficient funds!");
		}
		sold = sold - amount;
		
	}

	@Override
	public void checkBalance() {
		
		System.out.println("Current sold is : " + sold);
		
		
	}

}
