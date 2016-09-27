import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	private static ArrayList<Student> students;
	private static Scanner sc; 
	public Student student;
	private static Boolean value =  true;
	public StudentMain(Student student) 
	{
		this.student = student;
		students.add(student);
	}

	public void display()
	{
		for(Student s:students)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args)
	{
	students = new ArrayList<Student>();
	sc = new Scanner(System.in);
		
	
	while(value.equals(true))
	{
	System.out.println("Enter First Name: ");
	String firstname = sc.nextLine();
	System.out.println("Enter Last Name: ");
	String lastname = sc.nextLine();
	System.out.println("Enter Id: ");
    int id = sc.nextInt();
	
    if(id !=-99)
	{
		Student stu = new Student(firstname,lastname,id);
		StudentMain stumain= new StudentMain(stu);
		stumain.display();
		sc.nextLine();
	}
	else
	{
		
	System.out.println("Thank You");
	value = false;
	}
	}
	}
}
