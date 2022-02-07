import java.util.*;

 class pallindrom_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    
        System.out.print("Enter the number - ");  
        int num= sc.nextInt();  
        if(Palindrome(num)||Armstrong(num)){
            System.out.println("True");
        }
        else
        System.out.println("False");
        sc.close();
      }

      public static boolean Armstrong(int num) {  
        int num1 = num;  
         
        String str = Integer.toString(num);  
        int rem;  
        int result = 0;  
        while (num > 0) {  
         rem = num % 10;  
         num = num / 10;  
         result = result + ((int) Math.pow(rem, str.length()));  
        }  
        if (result == num1) {  
         return true;  
        } else {  
         return false;  
        }  
       }  
       public static boolean Palindrome(int num) {  
        int  rev = 0, remainder;

        int temp = num;
        while (num != 0) {
          remainder = num % 10;
          rev = rev * 10 + remainder;
          num /= 10;
        }
        
       
        if (temp == rev) {
          return true;
        }
        else {
          return false;
        }
       }  
      
}
