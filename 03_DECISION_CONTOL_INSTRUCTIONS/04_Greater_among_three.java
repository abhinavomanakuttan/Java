 
 // To print gratest among 3 numbers in java using nested if else

 import java.util.*;
 class Greater_among_three {
    public static  void main(String[] aggs){
        System.out.println("Enter 3 numbers");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st numbers");
        int num1=sc.nextInt();

        System.out.println("Enter 2nd numbers");
        int num2=sc.nextInt();

        System.out.println("Enter 3rd numbers");
        int num3=sc.nextInt();

        if(num1>num2){
            if(num2>num3){
                System.out.println(num1+" is greater  ");
            }else{
                System.out.println(num3+" is greater");
            }
        }else {
            if(num2>num3){
             System.out.println(num2+" is grater");
            }else{
                System.out.println(num3+" is greater ");

            }
        }
         // // int greater = num1 > num2 ? num1 > num3 ? num1 : num3 : num2 > num3 ? num2
    // //                                                                    : num3;
    // // printf("\n%f is Greater", greater);

    // // using logical operator and if-else-if ladder
    // // if (num1 > num2 && num1 > num3)
    // //    printf("\n%f is Greater", num1);
    // // else if (num2 > num3)
    // //    printf("\n%f is Greater", num2);
    // // else
    // //    printf("\n%f is Greater", num3);
       
    /*

        System.out.println("Enter 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int max=a;

        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }

        System.out.println("max value "+max);

*/


    }
    
}
