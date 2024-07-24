 
 // To check whether a given number is three-digit number  or not  
 import java.util.*;
 class Three_digit {
    public static void main(String [] aggs){
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        if(num>99 && num<1000 || num< -99 && num>-1000){
            System.out.print("Enterd number is a three-digit number: "+num);

        }else {
            System.out.println("Enterd number is not a Three-digit number: "+num);
        }



    }
    
}
