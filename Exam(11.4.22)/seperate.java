import java.io.*;
import java.lang.*;
import java.util.*;
 
public class seperate {
 
   
    static boolean isPrime(int n)
    {
        
        if (n <= 1)
            return false;
 
        if (n <= 3)
            return true;
 
       
        if (n % 2 == 0 || n % 3 == 0)
            return false;
 
      
        for (int i = 5; i * i <= n; i = i + 6) {
 
            
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
 
       
        return true;
    }
 
    
    static void segregatePrimeNonPrime(int arr[], int N)
    {
       
        
        int pr[]= new int[N-1];
        int np[]=new int[N-1];
        int i =0, nP=0, nNp=0;

     
        while (i < N) {
 
           
            if (isPrime(arr[i])){
                 pr[nP] = arr[i];
                i++;
                nP++;

            }
               else 
               {
                np[nNp] = arr[i];
                nNp++;
                i++;
            }
               
 
            
            
        }
       nP--; nNp--;
       Arrays.sort(np,0,nNp+1);
       Arrays.sort(pr,0,nP+1);
      
        i=0;
        while(i<=nP){
             arr[i]= pr[i];
             i++;
        }
        int j=0;
        while(i<N){
            arr[i]= np[j];
            i++; j++;
        }

        for ( i = 0; i < nP; i++)
        System.out.print(pr[i] + " ");
        System.out.println();

        for ( i = 0; i < nNp; i++)
        System.out.print(np[i] + " ");
        System.out.println();
        for ( i = 0; i < N; i++)
        System.out.print(arr[i] + " ");

    }
 
    // Driver Code
    public static void main(String[] args)
    {
 
        int arr[] = { 1,2,10,3,4,54, 7,45};
        int N = arr.length;
        
        segregatePrimeNonPrime(arr, N);
    }
}