import java.util.*;
public class Account
{
int Accno;
String AccHolderName;
char Account_type;
double balance;
Account(int a, String b, char c, double d)
{
this.Accno = a;
this.AccHolderName = b;
this.Account_type = c;
this.balance = d;
}
public void disp ()
{
System.out.println("Details");
System.out.println("Account number : " + Accno);
System.out.println("Account holder name : " + AccHolderName);
System.out.println("Account type : " + Account_type);
System.out.println("Account balance : " + balance);
}
public void deposit (double price)
{
System.out.println("Account in balance : (initial) " + balance);
double amount = balance + price;
System.out.println("Account deposited : " + price);
System.out.println("Account in balance : (final) " + amount);
}
public void withdraw (double price)
{
System.out.println("Account in balance : (initial) " + balance);
double amount = balance - price;
System.out.println("Account withdrawn : " + price);
System.out.println("Account in balance : (final) " + amount);
}
public void search (int num)
{
if (num == Accno)
{
System.out.println("Details");
System.out.println("Account number : " + Accno);
System.out.println("Account holder name : " + AccHolderName);
System.out.println("Account type : " + Account_type);
System.out.println("Account balance : " + balance);
}
else
{
System.out.println("Wrong account number.");
}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Implementation of banking system.");
System.out.println("Enter the details.");
int id; String name; char type; double total;
System.out.println("Enter the account id: ");
id = sc.nextInt();
System.out.println("Enter the account holder name: ");
name = sc.next();
System.out.println("Enter the account type: (S for savings, Cforcurrent) ");
type = sc.next().charAt(0);
System.out.println("Enter the account balance: ");
total = sc.nextDouble();
Account obj = new Account(id, name, type, total);
System.out.println("1- Display details 2- Deposit amount 3- Withdraw amount 4- Search account");
int ch;
System.out.println("Enter the choice: ");
ch = sc.nextInt();
switch(ch)
{
case 1:
{
obj.disp();
break;
}
case 2:
{
double a;
System.out.println("Enter the amount to be deposited");
a = sc.nextDouble();
obj.deposit(a);
break;
}
case 3:
{
double a;
System.out.println("Enter the amount to be withdrawn");
a = sc.nextDouble();
obj.withdraw(a);
break;
}
case 4:
{
int a;
System.out.println("Enter the account id to be searched");
a = sc.nextInt();
obj.search(a);
break;
}
default : System.out.println("Wrong choice.");
}
sc.close();
}
}
