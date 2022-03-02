import java.util.*;
public class Q3 {
    String name;
  int rno;
  String branch;
  char sec;
  String uni;
  double cgpa;
  double sgpa;
  int a,b,c,d,e,t;
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
  void total()
  {
     Scanner sc = new Scanner(System.in); 
     
     System.out.println("Enter the marks in Subject 1 : ");
     a = sc.nextInt();
     System.out.println("Enter the marks in Subject 2 : ");
     b = sc.nextInt();
     System.out.println("Enter the marks in Subject 3 : ");
     c = sc.nextInt();
     System.out.println("Enter the marks in Subject 4 : ");
     d = sc.nextInt();
     System.out.println("Enter the marks in Subject 5 : ");
     e = sc.nextInt();
     int total = a + b + c+ d+ e;
     t = total;
     System.out.println("Total : " + total);   
     sc.close();
  }
  void average()
  {
      System.out.println("Average : " + t/5);
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
      Q3 obj = new Q3();
      obj.getdata();
      obj.display();
      obj.total();
      obj.average();
  }
}
