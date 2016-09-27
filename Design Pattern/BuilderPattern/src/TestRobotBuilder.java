public class TestRobotBuilder 
{

	public static void main(String...args)
	{
		RobotBuilder builder = new OldRobotBuilder();
		RobotEngineer engineer = new RobotEngineer(builder);
		
		engineer.makeRobot();
		Robot firstrobot = engineer.getRobot();
		
		System.out.println("Robot Built");
		System.out.println("Robot Head Type" + firstrobot.getRobotArms());
		System.out.println("Robot Torso Type" + firstrobot.getRobotTorso());
		System.out.println("Robot Legs Type" + firstrobot.getRobotLegs());
		System.out.println("Robot Arms Type" + firstrobot.getRobotArms());
		
	}

}
