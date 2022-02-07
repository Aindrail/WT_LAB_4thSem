import java.util.*;
class spy {
   public static void main(String []args){
       System.out.print("Enter Number: ");
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     int a,b=0,multi=1,n1=num;
     while(num!=0){
         a=num%10;
         b+=a;
         multi*=a;
         num/=10;
    }
        if(b==multi){
            System.out.println(n1 +" is a Spy Number");
        }
        else
        System.out.println(n1 + " is not a Spy Number");
     sc.close();
   }   
}
