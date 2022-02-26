import java.util.*;
public class Volume
{
static double vol (double r)
{
return (4 * 3.14 * r * r * r)/3;
}
static double vol (int b, int h)
{
return b * h;
}
static double vol (double r, int h)
{
return (22.7 * r * r * h);
}
static double vol (double r, double h)
{
return (22.7 * r * r * (h/3));
}
static double vol (double l, double w, double h)
{
return l * w * h;
}
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println(" Volume calculator ");
System.out.println(" 1 - Sphere, 2 - Prism, 3 - Cylinder, 4 - Cone, 5- Cuboid");
int c;
System.out.println("Enter your choice : ");
c = sc.nextInt();
double res;
switch (c)
{
case 1 :
{
double r;
System.out.println("Enter the radius of the circle");
r = sc.nextDouble();
res = vol(r);
System.out.println("Volume of the circle : " + res);
break;
}
case 2 :
{
int b, h;
System.out.println("Enter the base and height of the prism");
b = sc.nextInt();
h = sc.nextInt();
res = vol(b,h);
System.out.println("Volume of the prism: " + res);
break;
}
case 3 :
{
double r; int h;
System.out.println("Enter the base and height of the cylinder");
r = sc.nextDouble();
h = sc.nextInt();
res = vol(r,h);
System.out.println("Volume of the cylinder : " + res);
break;
}
case 4 :
{
double r, h;
System.out.println("Enter the base and height of the cone");
r = sc.nextDouble();
h = sc.nextDouble();
res = vol(r,h);
System.out.println("Volume of the cone : " + res);
break;
}
case 5 :
{
double l,b,h;
System.out.println("Enter the length, breadth and height of the cuboid");
l = sc.nextDouble();
b = sc.nextDouble();
h = sc.nextDouble();
res = vol(l,b,h);
System.out.println("Volume of the cuboid : " + res);
break;
}
default : System.out.println("Wrong choice.");
}
sc.close();
}
}
    

