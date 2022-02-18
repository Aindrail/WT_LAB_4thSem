import java.util.Scanner;

public class Q4 {
    public static void main (String[] args)
    {
            Scanner sc = new Scanner(System.in);
            int num; 
            System.out.println("Enter the number");
            num = sc.nextInt();
            int temp = num, c= 0; 
            while (temp != 0)
            {
                c++;
                temp/=10;        
            }
            if (c == 1)
            {
                switch (num)
                {
                    case 0 : System.out.print("Zero"); break;
                    case 1 : System.out.print("One"); break;
                    case 2 : System.out.print("Two"); break;
                    case 3 : System.out.print("Three"); break;
                    case 4 : System.out.print("Four"); break;
                    case 5 : System.out.print("Five"); break;
                    case 6 : System.out.print("Six"); break;
                    case 7 : System.out.print("Seven"); break;
                    case 8 : System.out.print("Eight"); break;
                    default : System.out.print("Nine");
                }
            }
            else
                if (c == 2)
                {
                    int t = num;
                    int n = num / 10;
                    switch (n % 10)
                    {
                    case 0 : System.out.print("."); break;
                    case 1 : System.out.print("One"); break;
                    case 2 : System.out.print("Twenty"); break;
                    case 3 : System.out.print("Thirty"); break;
                    case 4 : System.out.print("Forty"); break;
                    case 5 : System.out.print("Fifty"); break;
                    case 6 : System.out.print("Sixty"); break;
                    case 7 : System.out.print("Seventy"); break;
                    case 8 : System.out.print("Eighty"); break;
                    default : System.out.print("Ninty");
                    }
                    switch (t % 10)
                    {
                    case 0 : System.out.print("."); break;
                    case 1 : System.out.print("One"); break;
                    case 2 : System.out.print("Two"); break;
                    case 3 : System.out.print("Three"); break;
                    case 4 : System.out.print("Four"); break;
                    case 5 : System.out.print("Five"); break;
                    case 6 : System.out.print("Six"); break;
                    case 7 : System.out.print("Seven"); break;
                    case 8 : System.out.print("Eight"); break;
                    default : System.out.print("Nine");
                    }
                }
            else
                if (c == 3)
                {
                    int t = num;
                    int m = num / 100;
                    int n = num / 10;
                    
                    switch (m % 10)
                    {
                    case 0 : System.out.print("."); break;
                    case 1 : System.out.print("One"); break;
                    case 2 : System.out.print("Two"); break;
                    case 3 : System.out.print("Three"); break;
                    case 4 : System.out.print("Four"); break;
                    case 5 : System.out.print("Five"); break;
                    case 6 : System.out.print("Six"); break;
                    case 7 : System.out.print("Seven"); break;
                    case 8 : System.out.print("Eight"); break;
                    default : System.out.print("Nine");
                    }
                    System.out.print(" hundred");
                    switch (n % 10)
                    {
                    case 0 : System.out.print("."); break;
                    case 1 : System.out.print("One"); break;
                    case 2 : System.out.print("Twenty"); break;
                    case 3 : System.out.print("Thirty"); break;
                    case 4 : System.out.print("Forty"); break;
                    case 5 : System.out.print("Fifty"); break;
                    case 6 : System.out.print("Sixty"); break;
                    case 7 : System.out.print("Seventy"); break;
                    case 8 : System.out.print("Eighty"); break;
                    default : System.out.print("Ninty");
                    }
                    switch (t % 10)
                    {
                    case 0 : System.out.print("."); break;
                    case 1 : System.out.print("One"); break;
                    case 2 : System.out.print("Two"); break;
                    case 3 : System.out.print("Three"); break;
                    case 4 : System.out.print("Four"); break;
                    case 5 : System.out.print("Five"); break;
                    case 6 : System.out.print("Six"); break;
                    case 7 : System.out.print("Seven"); break;
                    case 8 : System.out.print("Eight"); break;
                    default : System.out.print("Nine");
                    }
                }
            else
                if (c == 4)
                {
                    int t = num;
                    int m = num / 1000;
                    int n = num / 100;
                    int o = num/10;
                    
                    switch (m % 10)
                    {
                    case 0 : System.out.print("."); break;
                    case 1 : System.out.print("One"); break;
                    case 2 : System.out.print("Two"); break;
                    case 3 : System.out.print("Three"); break;
                    case 4 : System.out.print("Four"); break;
                    case 5 : System.out.print("Five"); break;
                    case 6 : System.out.print("Six"); break;
                    case 7 : System.out.print("Seven"); break;
                    case 8 : System.out.print("Eight"); break;
                    default : System.out.print("Nine");
                    }
                    System.out.print(" thousand ");
                    switch (n % 10)
                    {
                    case 0 : System.out.print("."); break;
                    case 1 : System.out.print("One"); break;
                    case 2 : System.out.print("Two"); break;
                    case 3 : System.out.print("Three"); break;
                    case 4 : System.out.print("Four"); break;
                    case 5 : System.out.print("Five"); break;
                    case 6 : System.out.print("Six"); break;
                    case 7 : System.out.print("Seven"); break;
                    case 8 : System.out.print("Eight"); break;
                    default : System.out.print("Nine");
                    }
                    System.out.print(" hundred ");
                    
                    switch (o % 10)
                    {
                    case 0 : System.out.print("."); break;
                    case 1 : System.out.print("One"); break;
                    case 2 : System.out.print("Twenty"); break;
                    case 3 : System.out.print("Thirty"); break;
                    case 4 : System.out.print("Forty"); break;
                    case 5 : System.out.print("Fifty"); break;
                    case 6 : System.out.print("Sixty"); break;
                    case 7 : System.out.print("Seventy"); break;
                    case 8 : System.out.print("Eighty"); break;
                    default : System.out.print("Ninty");
                    }
                    switch (t % 10)
                    {
                    case 0 : System.out.print("."); break;
                    case 1 : System.out.print("One"); break;
                    case 2 : System.out.print("Two"); break;
                    case 3 : System.out.print("Three"); break;
                    case 4 : System.out.print("Four"); break;
                    case 5 : System.out.print("Five"); break;
                    case 6 : System.out.print("Six"); break;
                    case 7 : System.out.print("Seven"); break;
                    case 8 : System.out.print("Eight"); break;
                    default : System.out.print("Nine");
                    }
                }
                sc.close();
            
                }
}
