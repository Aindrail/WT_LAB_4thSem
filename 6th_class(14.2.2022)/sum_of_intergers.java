import java.util.*;
public class sum_of_intergers
{
  public static int sum(int[] arr, int n)
{
   int s = 0;
   for (int i = 0; i < n; i++)
   {
      s += arr[i];
   }
   return s;
}     
  public static void main (String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of integers : ");
      int num = sc.nextInt();
      int ar[] = new int[num];
      for (int i = 0; i < num; i++)
      {
          System.out.println("Enter the integers :  ");
          ar[i] = sc.nextInt();
      }
      int res = sum(ar, num);
      System.out.println("Sum of the integers : " + res);
      sc.close();
  }
}