
//To check whether a given number is divisible by a number in java
import java.util.*;
class Divisible_by_a_number {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println("Enter a number to check whether it is sivisible by:  ");
        int n=sc.nextInt();

        if(num%n==0){
            System.out.println("Number is  divisible by "+n);
        
        }else{
            System.out.println("Number is not divisibel by "+n);

        }
    }
    
}
