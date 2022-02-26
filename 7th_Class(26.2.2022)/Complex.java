import java.util.*;
class Complex
{
double real, imaginary;
Complex(double r, double i)
{
this.real = r;
this.imaginary = i;
}
public void disp ()
{
System.out.println(this.real + " + " + this.imaginary + " i");
}
public static Complex add (Complex n1, Complex n2)
{
Complex res = new Complex (0, 0);
res.real = n1.real + n2.real;
res.imaginary = n1.imaginary + n2.imaginary;
return res;
}
public static Complex subtract (Complex n1, Complex n2)
{
Complex r = new Complex (0, 0);
r.real = n1.real - n2.real;
r.imaginary = n1.imaginary - n2.imaginary;
return r;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
double r1,c1,r2,c2;
System.out.println("Enter the first complex number : ");
r1 = sc.nextDouble();
c1 = sc.nextDouble();
System.out.println("Enter the second complex number : ");
r2 = sc.nextDouble();
c2 = sc.nextDouble();
Complex num1 = new Complex (r1, c1);
Complex num2 = new Complex (r2, c2);
Complex sum = add(num1, num2);
Complex difference = subtract(num1, num2);
System.out.println("Addition of two complex numbers : " );
sum.disp();
System.out.println("Subtraction of two complex numbers : " );
difference.disp();
sc.close();
}
}