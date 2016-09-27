public class StackMain {

	public static void main(String...args) throws Exception 
	{
		Stack stack = new Stack(10);
		//System.out.println(stack.size());
		//System.out.println(stack.isEmpty());
		//System.out.println(stack.pop());
		stack.push(5);
		System.out.println(stack.toString());
		System.out.println(stack.top());
	}

}
