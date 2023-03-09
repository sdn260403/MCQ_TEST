import java.awt.event.*;
import javax.swing.*;

class sf implements ActionListener
{
    static int marks;
    int co,flag=0;
    JRadioButton rb[] = new JRadioButton[4];
    JFrame f =new JFrame("Question Palette");
    sf(String q,String correct,String a,String b,String c,String d)
    {
        JPanel p = new JPanel();
        ButtonGroup bg =new ButtonGroup();
        String op1,op2,op3,op4;
        if(q.length()>50)
            q="<html>"+"QUESTION : "+"<br>"+q.substring(0,50)+"<br>"+q.substring(50)+"</html>";
        else
            q="<html>"+"QUESTION : "+"<br>"+q+"</html>";
        op1=a;
        op2=b;
        op3=c;
        op4=d;
        JLabel l =new JLabel(q);
        co=Integer.parseInt(correct)-1;
        l.setBounds(5,5,1500,50);
        f.setBounds(500,250,500,350);

        rb[0]=new JRadioButton(op1);
        rb[0].setBounds(30,60,500,50);
        rb[1]=new JRadioButton(op2);
        rb[1].setBounds(30,110,500,50);
        rb[2]=new JRadioButton(op3);
        rb[2].setBounds(30,160,500,50);
        rb[3]=new JRadioButton(op4);
        rb[3].setBounds(30,210,500,50);
        f.add(l);
        bg.add(rb[0]);bg.add(rb[1]);bg.add(rb[2]);bg.add(rb[3]);
        f.add(p);
        f.add(rb[0]);f.add(rb[1]);f.add(rb[2]);f.add(rb[3]);
        f.setLayout(null);
        f.setVisible(true);

        rb[0].addActionListener(this);
        rb[1].addActionListener(this);
        rb[2].addActionListener(this);
        rb[3].addActionListener(this);
    }
  
    public void actionPerformed(ActionEvent e)
    {
        if(!rb[co].isSelected())
            incorrect();   
        else{
        marks+=(rb[co].isSelected())? 1 : 0;
        f.dispose();
        modify();
    }
    }
    void modify()
    {
        flag=1;
    }
    void incorrect()
    {
        JPanel p1 = new JPanel();
        JLabel l =new JLabel("Correct Answer: "+rb[co].getText());
        JFrame inc = new JFrame();
        JButton button = new JButton("close");
        inc.setBounds(630,500,350,100);
        button.setBounds(240,20,70,30);
        l.setBounds(5,5,150,50);
        inc.add(p1);
        inc.add(l);
        inc.add(button);
        inc.setLayout(null);
        inc.setVisible(true);
       
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                inc.dispose();
                f.dispose();
                modify();
            }
        });
    }
    void close()
    {
        f.dispose();
        System.gc();
    }
    
    
}
