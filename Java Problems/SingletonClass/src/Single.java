import java.util.LinkedList;
import java.util.Collections;
import java.util.Arrays;
public class Single {

	private Single() {}
	
	private static Single single = null;
	
	Integer[] ar = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,
			        31,32,33,34,35,36,37,38,39,50,51,52,53,54,55,56,57,58,59,50,
			        };
	private LinkedList<Integer> num = new LinkedList<Integer>(Arrays.asList(ar));
	
	static boolean firsthead = true;
	
	public static Single getThread()
	{
		if(single==null)
		{
			if(firsthead)
			{
				firsthead = false;
			}
			
			Thread.currentThread();
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		
			single = new Single();
			Collections.shuffle(single.num);
		}
		
		return single;
	}
	
	public LinkedList<Integer> showNumbers()
	{
		return single.num;
	}
	
	public LinkedList<Integer> getNumber(int howManyNumbers)
	{
		LinkedList<Integer> adder = new LinkedList<>();
		for(int i = 0 ; i<howManyNumbers;i++)
		{
			adder.add(single.num.remove(0));
		}
		
		return adder;
	}
	
}
