import java.util.*;
public class Distance
{
double feet, inches;
Distance(double f, double i)
{
this.feet = f;
this.inches = i;
}
public void disp ()
{
System.out.println(this.feet + " and " + this.inches + ".");
}
public static Distance add (Distance d1, Distance d2)
{
Distance res = new Distance (0, 0);
res.feet = d1.feet + d2.feet;
res.inches = d1.inches + d2.inches;
if (res.inches >= 12)
{
res.inches = res.inches - 12;
res.feet = res.feet + 1;
}
return res;
}
public static Distance subtract (Distance d1, Distance d2)
{
Distance res = new Distance (0, 0);
res.feet = d1.feet - d2.feet;
res.inches = d1.inches - d2.inches;
if (res.inches < 0)
{
res.inches = res.inches + 12;
res.feet = res.feet - 1;
}
return res;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
double f1,i1,f2,i2;
System.out.println("Enter the first distance : ");
f1 = sc.nextDouble();
i1 = sc.nextDouble();
System.out.println("Enter the second distance : ");
f2 = sc.nextDouble();
i2 = sc.nextDouble();
Distance dis1 = new Distance (f1, i1);
Distance dis2 = new Distance (f2, i2);
Distance sum = add(dis1, dis2);
Distance difference = subtract(dis1, dis2);
System.out.println("Addition of two distances : " );
sum.disp();
System.out.println("Subtraction of two distances : " );
difference.disp();
sc.close();
}
}