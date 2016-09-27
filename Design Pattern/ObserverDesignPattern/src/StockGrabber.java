import java.util.ArrayList;

public class StockGrabber implements Subject {
	
	private double ApplStock;
	private double GoogStock;
	private double IBmStock;
	
	ArrayList<Observer> observers;

	public StockGrabber() 
	{
	observers = new ArrayList<Observer>();	
	}


	public void register(Observer addobserver) 
	{
	
		observers.add(addobserver);
		
	}


	public void unregister(Observer deleteobserver)
	{
	int observerindex = observers.indexOf(deleteobserver);
	System.out.println("The Obsever"+(observerindex+1)+" Deleted");
	observers.remove(observerindex);	
	}


	public void notifyObserver() 
	{
	for(Observer o:observers)
	{
		o.update(IBmStock, ApplStock, GoogStock);
	}
		
	}

	public void setApplStock(double applStock) {
		ApplStock = applStock;
		notifyObserver();
	}


	

	public void setGoogStock(double googStock) {
		GoogStock = googStock;
		notifyObserver();
	}


	

	public void setIBmStock(double iBmStock) {
		IBmStock = iBmStock;
		notifyObserver();
	}

}
