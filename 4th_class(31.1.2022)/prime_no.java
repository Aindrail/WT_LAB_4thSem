public class prime_no {
    public static void main(String args[]){    
        int n=0;
        for(int i=1;i<100;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    n++;
            }
            if(n==2)
                System.out.print(i+"  ");
            n=0;
        } 
      }    
}
