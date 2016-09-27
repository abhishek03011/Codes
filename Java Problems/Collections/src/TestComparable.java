import java.util.ArrayList;
import java.util.Collections;
public class TestComparable {
	
	public static void main(String...args)
	{
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(15,"jojo",3));
		al.add(new Student(16,"frooti",2));
		al.add(new Student(18,"chintu",1));
	
		Collections.sort(al);
		
		java.util.Iterator<Student> il = al.iterator();
		
		while(il.hasNext())
		{
			System.out.println(il.next());
		}
	}

}
