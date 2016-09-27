import java.util.*;
public class ArrayListTrial {

	class inner
	{
		private int age;
		private String name;
		private String addr;
		
		public inner(int age,String name,String addr)
		{
			this.age = age;
			this.addr = addr;
			this.name = name;
		}
	}
	public static ArrayList<String> a = new ArrayList<String>();
	private static inner i;
	
	public static void main(String...args)
	{
	a.add("Bob");
	a.add("Ballu");
	a.add("aldahhu");
	a.add("chandil");
   
	Iterator<String> al = a.iterator();
	while(al.hasNext())
	{
		System.out.println(al.next());
	}
	
	System.out.println("For each loop");
	for(String b:a)
	{
		System.out.println(b);
	}
	
	ArrayListTrial array = new ArrayListTrial();
	ArrayListTrial.inner student1 = array.new inner(10,"Ballu","2000 Bay area #915");
	ArrayListTrial.inner student2 = array.new inner(10,"Alladhu","2000 Bay area #915");
	ArrayListTrial.inner student3 = array.new inner(10,"Chandil","2000 Bay area #915");
	
	ArrayList<ArrayListTrial.inner> save = new ArrayList<ArrayListTrial.inner>();
	save.add(student1);
	save.add(student2);
	save.add(0,student3);
	
	for(ArrayListTrial.inner temp: save)
	{
		System.out.println("The name is : "+ temp.name +" The Age is : "+ temp.age +" The address is : "+temp.addr);
	}
    
	
	
	}
	
	

}
