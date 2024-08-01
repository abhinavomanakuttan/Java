
import java.util.Scanner;

 class Another_Syntax {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the day: ");

        int day =in.nextInt();

        switch (day) {

            case 1 -> System.out.println("Monday");

            case 2 ->System.out.println("Thusday");

            case 3 ->System.out.println("Wednesday");

            case 4 ->System.out.println("Thuesday");

            case 5 ->System.out.println("friday");

            case 6 ->System.out.println("Saturday");

            case 7 ->System.out.println("Sunday");

            default ->System.out.println("Enter properly");
            

            
        }
    }
    
}
