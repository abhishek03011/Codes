
import java.util.ArrayList;
public class AtmImplementer implements ATM
{
 private double depositmoney;
 private double withdrawal;
 private double balanceEnquiry;
 private double balance ;
 Customer customer;
 ArrayList<AtmImplementer> customers;
 ArrayList<String> money;
 
 public AtmImplementer(Customer customer) 
	{
	 customers = new ArrayList<AtmImplementer>();
	 money =  new ArrayList<String>();
		this.customer = customer;
		this.depositmoney = 0.0;
		this.withdrawal = 0.0;
		this.balanceEnquiry = 0.0;
		this.balance = 0.0;
	}


	public double getDepositmoney() 
	{
		return depositmoney;
	}

	public void setDepositmoney(double depositmoney) 
	{
		this.depositmoney = depositmoney;
	}

	public double getWithdrawal() 
	{
		return withdrawal;
	}

	public void setWithdrawal(double withdrawal) 
	{
		this.withdrawal = withdrawal;
	}

	public double getBalanceEnquiry() 
	{
		return balanceEnquiry;
	}

	public void setBalanceEnquiry(double balanceEnquiry) 
	{
		this.balanceEnquiry = balanceEnquiry;
	}

	public void register( AtmImplementer customer)
	{	
	customers.add(customer);
	System.out.println("Added the new customer");
	}


	public void name() 
	{
	System.out.println();	
	}


	public String openingdate() 
	{
		long millis=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(millis);  
		return "The opening date is: " + date;
	}


	public String transactions()
	{
		long millis=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(millis);  
		
		return null;
	}


	public double balanceEnquiry() 
	{
	
		return 0.0;
	}


	public double withdrawal(double withdrawal) 
	{
		if(withdrawal > balance)
		{
			System.out.println("Withdraw less than balance");
		}
		else
		{
			balance-=withdrawal;
			long millis=System.currentTimeMillis();  
			java.sql.Date date=new java.sql.Date(millis); 
			 String x = date + "\t" + "Withdrawal" + "\t" + withdrawal;
			 money.add(x);
			 return balance;
		}
     return 0.0;
	}


	public double deposit(double depositmoney)
	{
      balance += depositmoney;
      long millis=System.currentTimeMillis();  
	  java.sql.Date date=new java.sql.Date(millis); 
      String x = date + "\t" + "Deposit" + "\t" + depositmoney;
	  money.add(x);
	  return balance;
	}

	public String toString() 
	{
		return "AtmImplementer [depositmoney=" + depositmoney + ", withdrawal=" + withdrawal + ", balanceEnquiry="
				+ balanceEnquiry + ", customer=" + customer + "]";
	}

}
