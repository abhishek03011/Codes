
public interface Fly {
   String flys();
}

class ItFlys implements Fly
{

	
	public String flys() {
		// TODO Auto-generated method stub
		
		return "Flying High";
	}
	
}

class CantFly implements Fly
{

	
	public String flys() {
		// TODO Auto-generated method stub
		return "Cannot Fly";
	}
	
}