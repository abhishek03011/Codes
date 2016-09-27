
public interface ATM 
{
public void register(AtmImplementer customer); 
public void name();
public String openingdate();
public String transactions();
public double balanceEnquiry();
public double withdrawal(double withdrawal);
public double deposit(double depositmoney);

}
