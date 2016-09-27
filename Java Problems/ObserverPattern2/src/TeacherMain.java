
public class TeacherMain {

	public TeacherMain() {
		
	}
public static void main(String...args)
{
	TeacherPublish teaches = new TeacherPublish();
	
	StudentRecipient student1 = new StudentRecipient(teaches);
	StudentRecipient student2 = new StudentRecipient(teaches);
	
	teaches.setHomework("Image Processing");
	teaches.setGrades("A");
	teaches.setPoints(100);
	
	teaches.setHomework("Database");
	teaches.setGrades("A-");
	teaches.setPoints(90);
	
	
	teaches.setHomework("parallel Processing");
	teaches.setGrades("A");
	teaches.setPoints(100);
	
}
}
