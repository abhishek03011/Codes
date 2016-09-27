
public class Student implements Comparable {

	private int age;
	private String name;
	private int roll;
	
public Student(int age,String name,int roll)
{
	this.age = age;
	this.name = name;
	this.roll = roll;
}
	
	
	public int compareTo(Object st) {
	
		Student stu = (Student)st;
		if(roll==stu.roll)
		return 0;
		else if(roll>stu.roll)
			return 1;
		
		else return -1;
	}


	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", roll=" + roll + "]";
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}




}
