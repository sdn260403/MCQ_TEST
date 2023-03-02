import java.util.*;
import java.io.*;
class runner
{
    static int[] generate()
    {
        int i,j,x[];
        x=new int[5];
        for(i=0;i<5;)
        {
            int key=(int)(Math.random()*40);
            for (j=i; j>=0;j--)
                if (key==x[j])
                    break;
            if (j==-1 ||j==0)
                x[i++]=key;
        }
        Arrays.sort(x);
        return x;
    }
    public static void main(String args[])throws IOException
    {
        Time tx =new Time(5);
        int c=0,l=0,gen[];
        String arr[][],name,roll,h=tx.getHr(),m=tx.getMin(),s=tx.getSec();
        arr=new String[5][6];
        Scanner sc = new Scanner(System.in);
        FileReader fr = new FileReader("mcq.txt");
        BufferedReader br = new BufferedReader(fr);
        np p1=new np();
        while(p1.flag!=1);
        name=p1.name;
        roll=p1.roll;
        gen=generate();
        while(c!=5)
        {
            if(l!=gen[c])
            {
                l++;
                continue;
            }
            String S;
            String a[]=new String[6];
            S=br.readLine();
            
            StringTokenizer ob = new StringTokenizer(S,",");
            int y=0;
            while(ob.hasMoreTokens())
            {
                String x=ob.nextToken();
                a[y]=x;
                y++;
            }
            arr[c]=a;
            c+=1;
        }
        bf x = new bf(name,roll,h+":"+m+":"+s,arr);
        x.work();
        br.close();

    }
}