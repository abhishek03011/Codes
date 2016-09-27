public class Robot implements RobotPlan
{

	private String head;
	private String arms;
	private String torso;
	private String legs;

	public void setRobotHead(String head)
	{
		this.head = head;
	}
	public String getRobotHead() 
	{	
		return head;
	}

	
	public void setRobotTorso(String torso)
	{
		this.torso = torso;
	}
	
	public String getRobotTorso()
	{
	return torso;
	}
	
	public void setRobotArms(String arms) 
	{
		this.arms = arms;
	}
	
	public String getRobotArms()
	{
		return arms;
	}
	
	public void setRobotLegs(String legs) 
	{
		this.legs = legs;	
	}

	public String getRobotLegs() 
	{
		return legs;
	}
	
}
