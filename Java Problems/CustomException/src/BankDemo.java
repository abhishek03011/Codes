
public class BankDemo 
{

	private int balance;
	
	private int number;
	
	public BankDemo(int number) 
	{
	this.number  = number;
	}

	public int deposit(int amount)
	{
		return balance+=amount;
	}
	
	public void Withdraw(int amount) throws ManualException
	{
		if(amount>=balance)
		{
			int needs = amount - balance;
			throw new ManualException(needs);
		}
		else
		{
			balance-=amount;
		}
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
