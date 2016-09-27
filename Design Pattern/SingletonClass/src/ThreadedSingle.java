
public class ThreadedSingle implements Runnable
{

	
	public void run() 
	{
	
	Single thread21 = Single.getThread();
	System.out.println("The Thread Id is: "+ System.identityHashCode(thread21));
	System.out.println(thread21.showNumbers());
	System.out.println(thread21.getNumber(5));
    System.out.println("Got here");
	}

}
