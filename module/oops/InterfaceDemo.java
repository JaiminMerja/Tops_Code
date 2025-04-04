package module.oops;
class Result
{
    String grade;
    public void setGrade()
    {
        grade = "A+";
    }
}
class Staff extends Result implements admin, InterfaceStudent
{
    String stname, sname;
    public void setStaffData()
    {
        sname = "Captain";
        stname = "Pirates";
    }
    @Override
    public void display()
    {
        //show();
        System.out.println("Sno is:"+sno);
        System.out.println("Admin name is:"+aname);
        System.out.println("Sname is:"+sname);
        System.out.println("Stname is:"+stname);
        System.out.println("Grade is:"+grade);
    }
}
public class InterfaceDemo 
{
    public static void main(String[] args) 
    {
        Staff s1 = new Staff();
        s1.setStaffData();
        s1.setGrade();
        s1.display();
        InterfaceStudent.show();
    }
}


// Other way

// interface birds 
// {
//     void learn(); 
// }
// class animal implements birds 
// {
//     @Override
//    public void learn() 
//    {
//         System.out.println("They are flying");
//     }
// }
// public class InterfaceDemo 
// {
//     public static void main(String[] args) 
//     {
//         animal a = new animal();
//         a.learn();
//     }
// }
