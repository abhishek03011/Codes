
public class LinkedListTrial {

	private int counter = 0;
	private nodeClass head;
	private nodeClass tail;
	public LinkedListTrial() {
		// TODO Auto-generated constructor stub
	}

public int getLength()
{
	
	if (head != null)
	{
		while(head.getNext()!=null)
		{
			counter = counter+1;
			head = head.getNext();
		}
	}
	return counter;
}

public void printlist()
{
	nodeClass current = head;
		while(current != null)
		{
		System.out.println(current.getData());
		current = current.getNext();
        }
	}
public void addelementatlast(Object data)
{
	nodeClass temp = new nodeClass(data);
  if(head == null)
  {
	  head = new nodeClass(data);
  }
	nodeClass current = head;
	if(current!=null)
	{
		while(current.getNext()!=null)
		{
			current = current.getNext();
		}
		current.setNext(temp);
		
	}
	
}

public void add()
{
	Object x = "";
tail = head;
while(tail.getNext()!= null)
{
	
	x = tail.getData();
	
	tail.setData(x);
    tail = tail.getNext();
}
}


@Override
public String toString() {
	String out = "";
	nodeClass current = tail;
	if(current != null)
	{
		while(current!= null)
		{
			out += "[" +current.getData().toString()+ "]";
			
			current = current.getNext();
		}
		
	}
	return out;
}
	
}
