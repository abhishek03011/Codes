
public class ThreadRunner {

	public static void main(String[] args) {
		
		Runnable unit1 = new ThreadedSingleton();
		Runnable unit2 = new ThreadedSingleton();
		unit2.run();
		unit1.run();
				
	}

}
