package student.fulltime.bca;
import java.util.Scanner;
public class BCAstudent
{

String name,sex;
                int age;
Scanner sc =new Scanner (System.in);
public void getdata()
{
System.out.println("Student name:");
name=sc.nextLine();
System.out.println("Student  Age:");
Age=sc.nextInt();
System.out.println("Student  sex:");
               sex=sc.nextLine();
}
public void display()
{
System.out.println("Student  details are:");
System.out.println("Student name:"+name);
System.out.println("Student  Age:"+age);
System.out.println("Student  sex:"+sex);
}
}

Secod class
import student.fulltime.bca.BCAstudent;
public class packagedemo
{
                public static void main(String args[])
{
BCAstudent std=new BCAstudent();
std.getdata();
std.display();
}
}
