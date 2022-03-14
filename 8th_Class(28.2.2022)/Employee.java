public class Employee 
{
    String name;
    int employee_id;
    double salary;
    Employee()
    {
        name = "NULL";
        employee_id = 0;
        salary = 0.0d;
    }
    Employee(String a, int b, double c)
    {
        name = a;
        employee_id = b;
        salary = c;
    }
    Employee (Employee e)
    {
        name = e.name;
        employee_id = e.employee_id;
        salary = e.salary;
    }
    void show()
    {
       System.out.println("Name " + name);
       System.out.println("Employee id " + employee_id);
       System.out.println("Salary " + salary);
    }
    public static void main(String[]args)
    {
        Employee obj1 = new Employee();
        obj1.show();
        Employee obj2 = new Employee("Aindrail", 74, 50000);
        obj2.show();
        Employee obj3 = obj2;
        obj3.show();
    }

}