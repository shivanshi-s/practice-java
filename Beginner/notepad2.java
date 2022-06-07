import java.awt.event.*;  
import javax.swing.*;  
public class notepad2 implements ActionListener  
{  
    JFrame frm;  
    JMenuBar mnubr;  
    JMenu fileMenu, editMenu, helpMenu;  
    JMenuItem cutItem, copyItem, pasteItem, selectAll;  
    JTextArea txtarea;  
    notepad2()  
    {  
        frm = new JFrame();  
        cutItem = new JMenuItem("cutItem");  
        copyItem = new JMenuItem("copyItem");  
        pasteItem = new JMenuItem("pasteItem");  
        selectAll = new JMenuItem("selectAllItem");  
        copyItem.addActionListener(this);  
        cutItem.addActionListener(this);  
        selectAll.addActionListener(this);  
        pasteItem.addActionListener(this);  
        mnubr = new JMenuBar();  
        mnubr.setBounds(5, 5, 400, 40);  
        fileMenu = new JMenu("File");  
        editMenu = new JMenu("Edit");  
        helpMenu = new JMenu("Help");  
        editMenu.add(cutItem);  
        editMenu.add(copyItem);  
        editMenu.add(pasteItem);  
        editMenu.add(selectAll);  
        mnubr.add(fileMenu);  
        mnubr.add(editMenu);  
        mnubr.add(helpMenu);  
        txtarea = new JTextArea();  
        txtarea.setBounds(5, 30, 460, 460);  
        frm.add(mnubr);  
        frm.add(txtarea);  
        frm.setLayout(null);  
        frm.setSize(500, 500);  
        frm.setVisible(true);  
    }  
    public void actionPerformed(ActionEvent ae)  
    {  
        if (ae.getSource() == cutItem)  
            txtarea.cut();  
        if (ae.getSource() == pasteItem)  
            txtarea.paste();  
        if (ae.getSource() == copyItem)  
            txtarea.copy();  
        if (ae.getSource() == selectAll)  
            txtarea.selectAll();  
    }  
    public static void main(String[] args)  
    {  
        new notepad2();  
    }  
}  
