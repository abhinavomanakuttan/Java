import  java.util.*;
class Number {

    public static void main(String[] args) {
         //asking the user to enter the number to be print

         Scanner sc=new Scanner(System.in); 

         System.out.println("Enter number to be print: ");
         int n=sc.nextInt();
 
         for(int i=1;i<=n;i++){
             System.out.println(i);
         }
 
 
    }
    
}
