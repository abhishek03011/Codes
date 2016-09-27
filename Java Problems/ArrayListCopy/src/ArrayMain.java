import java.util.ArrayList;

public class ArrayMain<T> {

 ArrayList<T> a = new ArrayList<T>(); 
	public ArrayMain() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String...args)
	{
		ArrayMain<Integer> a1 = new ArrayMain<Integer>();
		a1.a.add(1);
		a1.a.add(2);
		a1.a.add(34);
		
		
			System.out.println(a1.a);
		
		
		ArrayList<Integer> b = new ArrayList<Integer>(a1.a);
		System.out.println(b);
	}
}
