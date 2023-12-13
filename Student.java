import java.util.*;
class student
{
 Scanner sc =new Scanner (System.in);
String E_id;
String name;
int s1,s2,s3,total;
student()
{
readstudentinfo();
}
public void readstudentinfo()
{
System.out.println("Enter the student details:");
System.out.println("Enter the Enrollment number:");
E_id=sc.next();
System.out.println("Enter the student name");
name=sc.next();
System.out.println("Enter the student marks in 3 subjects:");
s1=sc.nextInt();
s2=sc.nextInt();
s3=sc.nextInt();
if(s1 >= 50 && s2 >= 50 && s3>= 50)
total=s1+s2+s3;
else
total=0;
}
public void displayinfo()
{
System.out.println(E_id+ "   "+name+"   "total);
}
} 
public class studentinfo
{
                public static void main(String args[])
                   {
                 student s[]= new student[3];
                     for(int i=0;i<3;i++)
               s[i]=new student();
             }
          System.out.println("Student Details");
           System.out.println("Enrollmentno"        "Name "    "Total);
                     for(int i=0;i<3;i++)
                     s[i].displayinfo();
            }
      }
}


