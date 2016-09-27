import java.util.LinkedList;
import java.util.List;
public class ThreadedSingleton implements Runnable {

	
	public void run() {
		LinkedList<String> listvalue = new LinkedList<String>();
		List<String> values = new LinkedList<String>();
		SingletonClass first = SingletonClass.getInstance();
		System.out.println("The Id of the process is : " + System.identityHashCode(first));
		System.out.println("The word List is : " + first.getList());
		listvalue = first.getWords(5);
		for(String a: listvalue)
		{
			if(a=="dadi")
				values.add(a);
		}
		System.out.println("My values are :" + values);
		System.out.println("Got it");
		values.clear();
		listvalue.clear();
	}

}
