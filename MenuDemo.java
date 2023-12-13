import java .awt.*;
public class MenuDemo
{
MenuDemo()
{
Frame fr=new Frame(“Menu Demo”);
MenuBar mb=new MenuBar();
Menu fileMenu=new MenuItem(“New”);
Menu editMenu=new MenuItem(“Edit”);
Menu viewMenu=new MenuItem(“View”);
mb.add(fileMenu);
mb.add(editMenu);
mb.add(viewMenu);
MenuItem a1=new MenuItem(“New”);
MenuItem a2=new MenuItem(“Open”);
MenuItem a3=new MenuItem(“Save”);
MenuItem b2=new MenuItem(“copy”);
MenuItem c1=new MenuItem(“Find”)
MenuItem a1=new MenuItem(“Show”);
fileMenu.add(a1);

fileMenu.add(a2);
fileMenu.add(a3);
fileMenu.add(b1);
fileMenu.add(b2);
fileMenu.add(c1);
fe.setMenuBar(mb);
fr.setSize(200,200);
fr.setLayout(null);
fr.setVisible(true);
}
Public static void main(String agrs[])
{
New MenuDemo();
}
}

