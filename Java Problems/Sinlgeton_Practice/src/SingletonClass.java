import java.util.LinkedList;
import java.util.Collections;
import java.util.Arrays;
public class SingletonClass {

	private SingletonClass() {}
	
	private static SingletonClass instance = null;
	
	String[] ar = {"dadi","mummy","papa","chacha","tau","bua","fufa","bhai","life","luck",
					"dadi","mummy","papa","chacha","tau","bua","fufa","bhai","life","luck",
					"dadi","mummy","papa","chacha","tau","bua","fufa","bhai","life","luck",
					"dadi","mummy","papa","chacha","tau","bua","fufa","bhai","life","luck"};
	
	private LinkedList<String> words = new LinkedList<String>(Arrays.asList(ar));
	
	private static boolean first = true;
	public static SingletonClass getInstance()
	{
		if(instance==null)
		{
			if(first)
			{
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				first = false;
				instance = new SingletonClass();
				Collections.shuffle(instance.words);
			}
		}
		return instance;
	}
	
	public LinkedList<String> getList()
	{
		return instance.words;
	}
	
	public LinkedList<String> getWords(int howMany)
	{
		LinkedList<String> ar = new LinkedList<String>();
		
		for( int i = 0; i < howMany; i++)
		{
			ar.add(instance.words.remove(0));
		}
		
		
		return ar;
	}

}
