
public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;
	
	public OldRobotBuilder()
	{
	this.robot = new Robot();	
	}
	
	public void buildRobotHead() 
	{	
		robot.setRobotHead("Tin Head");
	}


	public void buildRobotTorso() 
	{
		robot.setRobotTorso("Tin Body");
	}


	public void buildRobotArms() {
		
		robot.setRobotArms("FlameThrower");
	}


	public void buildRobotLegs() {
		
		robot.setRobotLegs("Roller Skates");
	}

	public Robot getRobot() 
	{
		
		return this.robot;
	}

}
