import java .aet.*;
import java.event.*;
public class personamdetails
{
Public static void main(String args[])
{
Frame f=new Frame(“Button Example”);
Label l=new Label(“Welcome to My page”);
l.setFont(new Font(“Callibri”,Font.Bold,16));
Label f1=new Label();
Label f2=new Label();
Label f3=new Label();
Label f4=new Label();
Label f5=new Label();
l.setBounds(250,30,600,50);
f1.setBounds(20,120,600,30);
f2.setBounds(20,160,600,30);
f3.setBounds(20,200,600,30);
f4.setBounds(20,240,600,30);
f5.setBounds(20,280,600,30);
Button b=new Button(“CLICK HERE FOR MY PERSONAL DETAILS”);
b.setFont(new Font(“Callibri”,Font.Bold,14));
b.setBounds(210,70,320,30);
b.addActionListner(new ActionListner();
f1.setText(“FULL NAME:Aishwarya Rao”);
f2.setText(“ FATHER NAME:ANAND  MOTHER NAME:SUMA  AGE:20”);
f3.setText(“ROLL NO:123  COLLEGE NAME:AIGS”);

f4.setText(“NATIONALITY:INDIAN CONTACT NO:98234512083”);
f5.setText(“ADDRESS:7th cross ,Maruthinagar,BENGALURU”);
}
}
f.add(b);
f.add(l);
f.add(f1);
f.add(f2);
f.add(f3);
f.add(f4);
f.add(f5);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
}
