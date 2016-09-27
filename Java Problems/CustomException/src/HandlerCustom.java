public class HandlerCustom 
{
public static void main(String...args)
{
	BankDemo bank = new BankDemo(10);
	bank.deposit(500);
	System.out.println("balance "+bank.getBalance());
	try
	{
	bank.Withdraw(1000);	
	}
	catch(ManualException e)
	{
		System.out.println("Sorry you are short by "+ bank.getBalance());
		e.printStackTrace();
	}

	System.out.println("Bank Statement");
}
	
}
