package Beginner;
import java.awt.*;

import org.w3c.dom.Text;

public class notepad extends Frame {
   notepad() {
      super("Notepad");
      setSize(980, 600);

      TextArea t = new TextArea();
       t.setBounds(100, 50, 700, 500);
       

      // Button b = new Button("File");
      // b.setBounds(10, 30, 50, 30);
      // Button b1 = new Button("Edit");
      // b1.setBounds(30, 40, 50, 30);
      // Button b2 = new Button("View");
      // b2.setBounds(50, 30, 50, 30);
      // Button b3 = new Button("Help");
      // b3.setBounds(70, 30, 50, 30);

      MenuBar mb=new MenuBar();
      Menu m1=new Menu("File");
      Menu m2=new Menu("Edit");
      Menu m3=new Menu("Format");
      Menu m4=new Menu("View");
      Menu m5=new Menu("Help");

      setMenuBar(mb);
      setVisible(true);
      setLayout(null);
      
      add(t);
      mb.add(m1);
      mb.add(m2);
      mb.add(m3);
      mb.add(m4);
      mb.add(m5);
   }

   private void setLineWrap(boolean b) {
   }

   public static void main(String[] args) {
      notepad obj = new notepad();
   }
}