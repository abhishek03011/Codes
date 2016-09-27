
public class RobotEngineer {
	
	private RobotBuilder robotbuilder;

	public RobotEngineer(RobotBuilder robotbuilder) 
	{
		this.robotbuilder = robotbuilder;
	}
	
	public Robot getRobot()
	{
		return this.robotbuilder.getRobot();
	}
	
	public void makeRobot()
	{
		this.robotbuilder.buildRobotArms();
		this.robotbuilder.buildRobotHead();
		this.robotbuilder.buildRobotLegs();
		this.robotbuilder.buildRobotTorso();
	}
}
