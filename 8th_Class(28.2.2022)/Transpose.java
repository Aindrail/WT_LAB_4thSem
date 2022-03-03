//  import java.util.*;
// public class Transpose 
// {
//     public static void main(String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int a[][] = new int[3][3];
//         for (int i = 0; i < 3; i++)
//         {
//             for (int j = 0; j < 3; j++)
//             {
//             System.out.println("Enter the number");
//             a[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Matrix");
//         for (int i = 0; i < 3; i++)
//         {
//             for (int j = 0; j < 3; j++)
//             {
//             System.out.print("  " + a[i][j]);
//             }
//             System.out.println();
//         }
//         for (int i = 0; i < 3; i++)
//         {
//             for (int j = 0; j < 3; j++)
//             {
//                 int t = a[j][i];
//                 a[j][i] = a[i][j];
//                 a[i][j] =t;
//             }
//         }
//       System.out.println("Transpose");
//       for (int i = 0; i < 3; i++)
//       {
//           for (int j = 0; j < 3; j++)
//           {
//           System.out.print("  " + a[j][i]);
//           }
//           System.out.println();
//       }
//       sc.close();
// }
// }
