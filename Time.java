import java.util.*;
class Time
{
    int m,s,et;
    Calendar cl = Calendar.getInstance();
    Time(int x)
    {
        m =cl.get(Calendar.MINUTE);
        s=cl.get(Calendar.SECOND);
        et=x;
    }
    boolean t()
    {
        Calendar cl = Calendar.getInstance();
        int cur =cl.get(Calendar.MINUTE);
        int curs=cl.get(Calendar.SECOND);
        if(cur==m+et && curs==s)
            return true;
        return false ;
    }
    String getHr()
    {
        Calendar c = Calendar.getInstance();
        int s;
        s=c.get(Calendar.HOUR_OF_DAY);
        return Integer.toString(s);
    }
    String getMin()
    {
        Calendar c = Calendar.getInstance();
        int s;
        s=c.get(Calendar.MINUTE);
        return Integer.toString(s);
    }
    String getSec()
    {
        Calendar c = Calendar.getInstance();
        int s;
        s=c.get(Calendar.SECOND);
        return Integer.toString(s);
    }
}
