import java.util.ArrayList;

public class GeneralMain {

	static ArrayList<GeneralJava<String,Integer>> list;
	
	public GeneralMain() 
	{
		 list = new ArrayList<GeneralJava<String,Integer>>(); 
	}
	public static void main(String[] args) 
	{
	
	@SuppressWarnings("unused")
	GeneralMain gm = new GeneralMain();
	GeneralJava<String, Integer> a = new GeneralJava<String, Integer>("Show up", new Integer(10));
	GeneralJava<String, Integer> b = new GeneralJava<String, Integer>("and Rock the world", new Integer(20));
	
	list.add(a);
	list.add(b);
	
	for(GeneralJava<String,Integer> arr: list )
	{
		System.out.println(arr);
	}
	
	

	}
}
