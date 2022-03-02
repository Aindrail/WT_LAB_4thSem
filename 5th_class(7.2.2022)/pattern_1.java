// import java.util.*;

 class pattern_1 {
     public static void main(String[] args){
        for(int i =0 ;i<4;i++){
int j=0;
    for(int k=0;k<i;k++){
        System.out.print("0");
    } System.out.print("*");
    j+=i+1;
int k = 4-i-1;
while(j<9-i){
while(k>0 && j<9){
System.out.print("0");
    k--;j++;
}

if(j<9)
System.out.print("*");
k=4-i-1;
j++;
}
int temp=i;

while(temp>0){
    System.out.print("0");
    temp--;
}

System.out.println("");
        }
        
     }
     
 }