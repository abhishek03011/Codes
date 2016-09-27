
public class StockMain {

	public StockMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		StockGrabber stock = new StockGrabber();
		StockObserver observer1 = new StockObserver(stock);
		StockObserver observer2 = new StockObserver(stock);
		
	 stock.setApplStock(197.00);
	 stock.setGoogStock(121.00);
	 stock.setIBmStock(214.00);

	}

}
