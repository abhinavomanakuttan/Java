 import java.util.*;
 class Fibonacci {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number ");
        int n=sc.nextInt();

        int a=0;
        int b=1;
        int count=1;
        
        while(count<=n){

        
            int temp=a;
            a=a+b;
            b=temp;
            count++;
            
            
            System.out.print(" "+a);
        
        }

    }

    
    
}
