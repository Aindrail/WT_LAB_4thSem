import java.util.*;
public class Repeat 
{
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
        for (int i = 0; i < n; i++)
        {
            int t = a[i];
            for(int j = i+1; j < n;j++)
            {
                if (t == a[j])
                {
                    System.out.println("Repeated element - " + a[j]);
                }
            }
               
        }
        sc.close();

    }
}