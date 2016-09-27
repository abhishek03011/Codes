
public class StudentRecipient implements Students {

	private String homework;
	private String grades;
	private double points;
	private static int studentCount = 0;
	
	private int studentId;
	
	private TeacherPublish teaches;
	
	public StudentRecipient(TeacherPublish teaches) 
	{
	this.teaches = teaches;
	this.studentId = ++studentCount;
	System.out.println("The new Student "+studentId);
	teaches.enrollStudents(this);
	}
	
	public void updatestudents(String homework, String grades, Double points) 
	{
		this.grades = grades;
		this.homework = homework;
		this.points = points;	
		print();
		
	}

	public void print()
	{
		System.out.println(studentId+"\nHomework details: "+homework+"\nGrades Received :"+grades+"\nPoints earned: "+points);
	}
}
