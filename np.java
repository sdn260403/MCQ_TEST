import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class np implements ActionListener
{
    int flag=0;
    String name,roll,option;
    JFrame f = new JFrame("DETAILS WINDOW");
    Label ln= new Label("ENTER NAME ");
    Label lr= new Label("ENTER ROLL NO. ");
    JPanel p =new JPanel();
    JButton button = new JButton("PROCEED");
    ButtonGroup bg =new ButtonGroup();
    TextField t1,t2;
    JRadioButton rb[] = new JRadioButton[5];
    String arr[]={"Function","String","Array","If-Switch-Math","General"};
    np()
    {

        f.getContentPane().setLayout(null);

        t1 = new TextField();
        t2 = new TextField();
        f.setSize(500,500);
        f.setLocation(700,300); 
        ln.setBounds(10,10,100,25);
        lr.setBounds(10,50,100,25);

        t1.setBounds(100,15,200,20);
        t2.setBounds(120,55,200,20);
        
        
        button.setBounds(250,350,200,30);
         
         
        rb[0]=new JRadioButton("Function");
        rb[0].setBounds(10,80,500,50);
        rb[1]=new JRadioButton("String");
        rb[1].setBounds(10,130,500,50);
        rb[2]=new JRadioButton("Array");
        rb[2].setBounds(10,180,500,50);
        rb[3]=new JRadioButton("If-Switch-Math");
        rb[3].setBounds(10,230,500,50);
        rb[4]=new JRadioButton("General");
        rb[4].setBounds(10,280,500,50);

        bg.add(rb[0]);bg.add(rb[1]);bg.add(rb[2]);bg.add(rb[3]);
        f.add(p);
        f.add(rb[0]);f.add(rb[1]);f.add(rb[2]);f.add(rb[3]);f.add(rb[4]);

        f.add(t1);
        f.add(ln);
        f.add(lr);
        f.add(t2);
        f.add(button);
        f.setLayout(null);
        f.setVisible(true);

        rb[0].addActionListener(this);
        rb[1].addActionListener(this);
        rb[2].addActionListener(this);
        rb[3].addActionListener(this);
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
                flag=1;
            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        for(int i=0;i<5;i++)
        {
            if(rb[i].isSelected())
                option=arr[i];
        }
        name=t1.getText();
        roll=t2.getText();
    }
    public static void main(String args[])
    {
        np ob=new np();
    }
}