
public class Student {

	private String firstName;
	private String lastName;
	private int Id;
	
	public Student(String firstName,String lastName,int Id) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.Id = Id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	public String toString() 
	{
		
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", Id=" + Id + "]";
	}
}
