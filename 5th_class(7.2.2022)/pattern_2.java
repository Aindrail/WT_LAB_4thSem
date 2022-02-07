import java.util.Scanner;

public class pattern_2 {
    public static void main(String args[])  
{  
    for(int i=3;i>=0;i--)
    {
        for(int j=1;j<=i+1;j++)
        {
            System.out.print(j);
        }
        for(int k=(i*2);k<6;k=k+2)
        {
            System.out.print("**");
        }
        for(int l=i+1;l>0;l--)
        {
            System.out.print(l);
        }
        System.out.println("");
    }
}
}
