
import java.util.*;

class Syntax{
    public static void main(String[] args) {
        /*
         Syntax
            switch(expression){
                case one:
                    //body
                    break;
                case two:
                    //body
                    break;
                
                default:
                    //comment
            }
                
         */

         Scanner in=new Scanner(System.in);
         System.out.println("Enter the day");
         int day=in.nextInt();

         switch (day) {
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("Thusday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thuesday");
            break;
            case 5:
            System.out.println("Friday");
            break;  
            case 6:
            System.out.println("Satruday");
            break;
            case 7:
            System.out.println("sunday");
            break;

            default:
            System.out.println("Please enter properly");

         }



    }
}