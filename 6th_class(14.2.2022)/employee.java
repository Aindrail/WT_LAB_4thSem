import java.util.*;
public class employee {
    String name;
  int id;
  String comp;
  double salary;
  void getdata()
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the name : ");
     name = sc.nextLine();
     System.out.println("Enter the Employee ID : ");
     id = sc.nextInt();
     System.out.println("Enter the name of company name : ");
     comp = sc.next();
     System.out.println("Enter the salary : ");
     salary = sc.nextDouble();
     sc.close();
   }
  void display()
  {
      System.out.println("Employee details.");
      System.out.println("Name : " + name);
      System.out.println("Employee id : " + id);
      System.out.println("Company Name : " + comp);
      System.out.println("Salary: " + salary);
       }
  public static void main (String[] args)
  {
      employee obj = new employee();
      obj.getdata();
      obj.display();     
  }


  }
  
  