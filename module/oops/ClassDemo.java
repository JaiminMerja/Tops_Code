package module.oops;
class Student 
{
	int sid;
	String sname,city;
	public void setDataValue()
	{
		sid=1;
		sname="Jaimin Merja";
		city="London";
	}
	public void display()
	{
		System.out.println("Student ID is:"+sid);
		System.out.println("Student Name is:"+sname);
		System.out.println("Student's City is:"+city);
	}
}
public class ClassDemo 
{
	public static void main(String[] args) 
	{
	Student s1 = new Student();
	// s1.display();
	s1.setDataValue();
	s1.display();
	}
}
