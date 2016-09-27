
public class SIngletonThreadMain {

	public static void main(String...args)
	{
		
		Runnable firstThread = new SingletonThread();
		
		Runnable SecondThread = new SingletonThread();
		
		new Thread(firstThread).start();
        new Thread(SecondThread).start();	
	}
		
	

}


