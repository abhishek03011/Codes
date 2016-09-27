
public class RunMainThreads {

	public static void main(String...args)
	{
		Runnable thread1 = new ThreadedSingle();
		Runnable thread2 = new ThreadedSingle();
		
		thread1.run();
		thread2.run();
	}
}
