
import java.util.*;

public class grade_portal{
String name;
int rno;
String branch;
char sec;
String uni;
double cgpa;
double sgpa;
void getdata()
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the name : ");
   name = sc.nextLine();
   System.out.println("Enter the roll number : ");
   rno = sc.nextInt();
   System.out.println("Enter the branch : ");
   branch = sc.next();
   System.out.println(" Enter the section : ");
   sec = sc.next().charAt(0);
   System.out.println("Enter the name of university : ");
   uni = sc.next();
   System.out.println("Enter the cgpa : ");
   cgpa = sc.nextDouble();
   System.out.println("Enter the sgpa : ");
   sgpa = sc.nextDouble();   
   sc.close();   
}
void display()
{
    System.out.println("Student details.");
    System.out.println("Name : " + name);
    System.out.println("Roll number : " + rno);
    System.out.println("Branch : " + branch);
    System.out.println("Section : " + sec);
    System.out.println("University : " + uni);
    System.out.println("CGPA: " + cgpa);
    System.out.println("SGPA : " + sgpa);    
}
public static void main (String[] args)
{
    grade_portal obj = new grade_portal();
    obj.getdata();
    obj.display();
}
}

