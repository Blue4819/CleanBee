import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class DisplayData extends JFrame implements ActionListener
{
    
    private Container c;
    private JLabel title;
    private JButton refresh;
    private JButton clear;
    private JTextArea tout;
    static String ToPrint = "";

    
    public DisplayData()
    {
        setTitle("Sensors Data");
        setBounds(300,90,900,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        
        c = getContentPane();
        c.setLayout(null);
        
        title = new JLabel("Sensors Data");
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
        
        refresh = new JButton("Refresh");
        refresh.setSize(100, 20);
        refresh.setLocation(150, 450);
        refresh.addActionListener(this);
        c.add(refresh);
        
        clear = new JButton("Reset");
        clear.setSize(100, 20);
        clear.setLocation(270, 450);
        clear.addActionListener(this);
        c.add(clear);
        
        tout = new JTextArea();
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == refresh)
        {
            String data = "Ultrasonic data \n" + ToPrint;
            tout.setText("Ultrasonic data");
        }
        
        if(e.getSource() == clear)
        {
            tout.setText("");
        }
    }
    
    public static void main(String[] args) throws Exception
    {
        DataExtract obj = new DataExtract();
        ToPrint = (obj.send().toString());
        DisplayData f = new DisplayData();
    }
}
