import java.util.LinkedList;
import java.util.List;
public class SingletonMainClass {

	public SingletonMainClass() {}
	
	public static void main(String...args)
	{

		LinkedList<String> dadi = new LinkedList<String>();
		List<String> my = new LinkedList<String>();
		
		SingletonClass thread1 = SingletonClass.getInstance();
		System.out.println("The Thread id is : " + System.identityHashCode(thread1));
		System.out.println("The word List : "+ thread1.getList());
		dadi = thread1.getWords(5);
		
		for(String s : dadi)
		{
			if(s=="dadi")
				my.add(s);
		}
		System.out.println("The words are : "+ my);
		
		dadi.clear();
		my.clear();
		
		SingletonClass thread2 = SingletonClass.getInstance();
		System.out.println("The Thread id is : " + System.identityHashCode(thread2));
		System.out.println("The word List : "+ thread2.getList());
		dadi = thread2.getWords(5);
		
		for(String s : dadi)
		{
			if(s=="dadi")
				my.add(s);
		}
		System.out.println("The words are : "+ my);
		
		
		
		

	}

}
