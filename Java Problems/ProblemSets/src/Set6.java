import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Set6 {

	public Set6() {
		
	}

	public static void count(int[]ar)
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i= 0; i<ar.length;i++)
		{
			if(map.containsKey(ar[i]))
			{
				map.put(ar[i], map.get(ar[i])+1);
			}
			else
			{
				map.put(ar[i], 1);
			}
		}
		
		System.out.println("The array is : "+ Arrays.toString(ar));
		System.out.println(map);
	}
	public static void main(String[] args) 
	{
		
		count(new int[]{4, 5, 4, 5, 4, 6});
	}

}
