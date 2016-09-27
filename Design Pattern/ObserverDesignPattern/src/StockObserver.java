
public class StockObserver implements Observer 
{

	private double applPrice;
	private double ibmPrice;
	private double googPrice;
	
	private StockGrabber stockist;
	private static int observerCounter = 0;
	private int observerID;
	
	public StockObserver(StockGrabber stockist) 
	{
		this.stockist = stockist;
		this.observerID = ++observerCounter;
		System.out.println("The new Observer" + this.observerID);
		
		stockist.register(this);
	}

	
	public void update(double ibmPrice, double aaplPrice, double googPrice)
	{
		this.ibmPrice = ibmPrice;
		this.applPrice = aaplPrice;
		this.googPrice = googPrice;	
		
		printprices();
	}

	public void printprices()
	{
		System.out.println(observerID +"\nIBM: "+ ibmPrice +"\nApple: "+ applPrice+"\nGoogle: "+googPrice);
	}
}
