import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class bf implements ActionListener
{
    static sf ob[]=new sf[5];
    static int count=5;
    static JFrame f=new JFrame("QuestionWindow");
    static JFrame fa=new JFrame("MarksWindow");
    static JButton button = new JButton("CLOSE");
    static JLabel la =new JLabel();
    static JLabel l3 =new JLabel();
    bf(String y,String Roll,String tm,String[][] arr)
    {
        y="NAME : "+y;
        Roll="ROLL NO.: "+Roll;
        
        JLabel l =new JLabel(y);
        l.setFont(new Font("Arial",Font.BOLD,20));
        JLabel l2 =new JLabel(Roll);
        l2.setFont(new Font("Arial",Font.BOLD,20));
        l3.setText("Time: "+tm); 
        l3.setFont(new Font("Arial",Font.BOLD,20));  
        button.setBounds(700,580,100,30);
        l.setBounds(5,5,500,50);
        l2.setBounds(5,20,500,70);
        l3.setBounds(600,10,500,50);
        la.setBounds(2,1,250,100);
        fa.setBounds(650,250,250,100);
        f.setBounds(350,50,850,680);
        f.add(l);f.add(l2);f.add(button);f.add(l3);
        f.setLayout(null);
        f.setVisible(true);
        button.addActionListener(this);
        ob[0] = new sf(arr[0][0],arr[0][5],arr[0][1],arr[0][2],arr[0][3],arr[0][4]);
        ob[1] = new sf(arr[1][0],arr[1][5],arr[1][1],arr[1][2],arr[1][3],arr[1][4]);
        ob[2] = new sf(arr[2][0],arr[2][5],arr[2][1],arr[2][2],arr[2][3],arr[2][4]);
        ob[3] = new sf(arr[3][0],arr[3][5],arr[3][1],arr[3][2],arr[3][3],arr[3][4]);
        ob[4] = new sf(arr[4][0],arr[4][5],arr[4][1],arr[4][2],arr[4][3],arr[4][4]);
        
    }

    static void check()
    {
        if(ob[count-1].flag==1)
            count-=1;
    }  
    public void actionPerformed(ActionEvent e)
            {
                fa.dispose();
                f.dispose();
                System.exit(0);
            }

    void work()
    {
        Time ti =new Time(2);
        String h=ti.getHr(),m=ti.getMin(),s=ti.getSec();
        while(ti.t()==false && count!=0)
        {
            h=ti.getHr();m=ti.getMin();s=ti.getSec();
            l3.setText("Time: "+h+":"+m+":"+s);
            check();
        }
        while(count!=0)
        {
            ob[count-1].close();
            count-=1;
        }
        //add Answer class
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                fa.dispose();
                f.dispose();
                System.exit(0);
            }
        });
        la.setText("        MARKS OBTAINED: "+Integer.toString(ob[0].marks));
        fa.add(la);
        fa.setVisible(true);
        Time tim =new Time(1);
        while(tim.t()==false);
        fa.dispose();
        f.dispose();       
    }
    
}