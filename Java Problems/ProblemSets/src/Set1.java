import java.util.*;
public class Set1 {

	public Set1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = input.nextInt();
		 int[] ar = new int[n];
		 System.out.println("Enter Elements");
		for(int i =0; i < ar.length;i++ )
		{
			ar[i]= input.nextInt();
		}
		
		Stack<Integer> stack = new Stack<Integer>();
	
		for(int i = 0; i<ar.length;i++)
		{
			stack.push(ar[i]);
		}
		
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop() + " ");
		}
	}

}
