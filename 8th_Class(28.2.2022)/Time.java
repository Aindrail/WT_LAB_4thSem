public class Time 
{
    int hours;
    int mins;
    int secs;
    Time ()
    {
        hours = 0;
        mins = 0;
        secs = 0;
    }
    Time (int a, int b, int c)
    {
        hours = a;
        mins = b;
        secs = c;
    }
    void add(Time obj, Time obj1)
    {
        secs = obj.secs + obj1.secs;
        if (secs >= 60)
        {
            secs = secs - 60;
            mins = mins + 1;
        } 
        mins = obj.mins + obj1.mins;
        if (mins >= 60)
        {
            mins = mins - 60;
            hours = hours + 1;
        }
        hours = obj.hours + obj1.hours;
    }
    void sub(Time obj, Time obj1)
    {
        secs = obj.secs - obj1.secs;
        if (secs <= 0)
        {
            secs = secs + 60;
            mins = mins - 1;
        } 
        mins = obj.mins - obj1.mins;
        if (mins <= 0)
        {
            mins = mins + 60;
            hours = hours - 1;
        }
        hours = obj.hours - obj1.hours;
    }
    void disp()
    {
        System.out.println("Time in hours, minutes and seconds : " +  hours + ", " + mins + " and " + secs);
    }
    public static void main(String []args)
    {
        Time t1 = new Time(1,25,35);
        t1.disp();
        Time t2 = new Time(0,10,20);
        t2.disp();
        Time t3 = new Time(0,0,0);
        System.out.println("Addition");
        t3.add(t1,t2);
        Time t4 = new Time(0,0,0);
        System.out.println("Subtraction");
        t4.sub(t1,t2);
        t3.disp();
        t4.disp();

    }
}