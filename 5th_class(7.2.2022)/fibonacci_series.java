public class fibonacci_series {
    public static void main(String[] args) {
  
        int n = 100, a = 0, b = 1;
            
        System.out.println("Fibonacci Series Upto " + n + ": ");
        
        while (a <= n) {
          System.out.print(a + ", ");
    
          int c = a + b;
          a = b;
          b = c;
    
        }
      }
}
