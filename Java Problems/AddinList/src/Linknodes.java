
public class Linknodes {

	private Nodes head;
	private static int counter;
	public Linknodes() {
		// TODO Auto-generated constructor stub
	}
public static int incerement()
{
	return counter++;
}
	
public void addNodes(int data)
{
	if (head == null)
	{
		head = new Nodes(data);
	}
 Nodes temp = new Nodes(data);
 Nodes current = head;
if (current != null)
{
	while(current.getNext()!= null)
	{
		current = current.getNext();
	}
	
	current.setNext(temp);

}
}
public int findsum()
{
	int sum = 0;
    Nodes current = head;

if(current!= null)
{
	while(current!=null)
	{
		System.out.println(current.getData());
		sum += current.getData();
		current = current.getNext();
	}
}

	return sum;
}



}
