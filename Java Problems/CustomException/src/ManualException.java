
public class ManualException extends Exception {

	/**
	 * 
	 */

private static final long serialVersionUID = 1L;
private int amount ;
public ManualException(int amount)
{
	this.amount = amount;
}
	
public int getAmount()
{
	return this.amount;
}
}
