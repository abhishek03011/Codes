import java.util.ArrayList;

public class TeacherPublish implements Teacher{

	private String homework;
	private String grades;
	private double points;
	
	ArrayList<Students> student;
	
	public TeacherPublish() {
		
		student = new ArrayList<Students>();
	}


	

	public void enrollStudents(Students stud) {
	
		student.add(stud);
		
	}


	public void unenrollStudents(Students stud) 
	{
		int index = student.indexOf(stud);
		student.remove(index);
		System.out.println("Student "+(index+1)+"removed");
	}

	
	public void posting() {
		
		for(Students stud: student)
		{
			stud.updatestudents(homework, grades, points);
		}
	}
	
	public void setHomework(String newhomework) {
		this.homework = newhomework;
		posting();
	}


	public void setGrades(String newgrades) {
		this.grades = newgrades;
		posting();
	}


	public void setPoints(double newpoints) {
		this.points = newpoints;
		posting();
	}


}
