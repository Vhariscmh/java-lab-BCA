class student
{
static String collegename="PES";
int rollno;
String name;
student(int rollno,String name)
{
this .rollno=rollno;
this .name=name;
}
void display()
{
System.out.println(collegename+" "+rollno+" "+name);
}

}
public class staticdemo
{
public static void main(String args[])
{
System.out.println("objects sharing static variable: collegename");
student s1=new student(101,"suhas");
student s2=new student(102,"sneha");
s1.display();
s2.display();
System.out.println("static variable chaged by one of the object");
s1.collegename="BMS";
s1.display();
s2.display();
}
}




