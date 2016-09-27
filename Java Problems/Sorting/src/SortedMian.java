import java.util.ArrayList;
import java.util.Collections;
public class SortedMian {

	public SortedMian() {
		// TODO Auto-generated constructor stub
	}
public static void main(String...args)
{
	ArrayList<Integer> ar = new ArrayList<Integer>();
	ar.add(20);
	ar.add(1);
	ar.add(15);
	ar.add(7);
	ar.add(100);
	ar.add(3);
	Sorted sort = new Sorted();
	System.out.println("The bubble sorted array ");
	System.out.println(sort.bubbleSort(ar));
	Collections.shuffle(ar);
	System.out.println("After Shuffling");
	System.out.println(ar);
	System.out.println("The selection sorted array ");
	System.out.println(sort.selectionSort(ar));
	Collections.shuffle(ar);
	System.out.println("After Shuffling");
	System.out.println(ar);
	System.out.println("The insertion sorted array ");
	System.out.println(sort.insertion(ar));

	
}
}
