package utility;

public class ContaCorrente
{

	String name = "Aderbaldo";
	String n_account;
	double balance = 2000;

	double withdraw(double withdraw_value)
	{
		
		balance -= (withdraw_value);
		return (balance - withdraw_value);
		
	}

	double deposit(double deposit_value)
	{
		
		balance += (deposit_value);
		return (balance + deposit_value);
		
	}

	double checkBalance()
	{
		
		return balance;
		
	}

	String checkName()
	{
		
		return name;
		
	}
	
	String changeName(String newName) 
	{
		name = newName;
		return name;
	}

}