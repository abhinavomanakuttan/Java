
import java.util.*;
class is_even{
    public static void main(String [] argg){
        System.out.println("Enter a number:");
        Scanner input=new Scanner(System.in);

        int num=input.nextInt();
        // // 1st Approach (using % Modulus opertor)

        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
         // // 2nd Approach (using & Bitwise AND operator)
    // // if (num & 1)
    // //    printf("\n%d is Odd", num);
    // // else
    // //    printf("\n%d is Even", num);

    // // 3rd Approach
    // // if (num / 2.0 - num / 2 == 0)
    // //    printf("\n%d is Even", num);
    // // else
    // //    printf("\n%d is Odd", num);

    // // 4th Approach
    // // if (num / 2 * 2 == num)
    // //    printf("\n%d is Even", num);
    // // else
    // //    printf("\n%d is Odd", num)

    }
}