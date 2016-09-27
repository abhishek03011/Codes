import java.util.Comparator;

public class ComparatorInterface implements Comparator<Student> {

Student stu;

ComparatorInterface(Student stu)
{
	this.stu = stu;
}

	public int compare(Student o1, Student o2) 
	{
		if(o1.getAge()==o2.getAge())
		return 0;
       else if(o1.getAge()>o2.getAge())
    	   return 1;
       else
    	   return 1;
    	   
	}

	public String toString() {
		return "ComparatorInterface [stu=" + stu + "]";
	}

}
