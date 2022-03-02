import java.util.*;
public class sub {
        public static void main(String []args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements");
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
            {
                System.out.println("Enter the number");
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n-1; i++)
            {
                if (a[i] - a[i+1] == 0)
                {
                    System.out.println("Numbers are - " + a[i] + " " + a[i+1]);
                }
                   
            }
         sc.close();
        }
    } 

