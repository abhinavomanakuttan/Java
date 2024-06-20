// // WAP to Take A Number And A Digit From User And Then Append The Digit in the Number -
// Number = 635 and Digit = 8 Then Make it => 6358
// // 👉 Output => Number => 635 and Digit => 8. 
//  Result After Appending 7 to 635 => 6358
import java.util.Scanner;
class append {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, digit, result;

        System.out.print("\nEnter An Integer => ");
        num = scanner.nextInt();
        System.out.print("\nEnter A Positive Digit to Append in Number => ");
        digit = scanner.nextInt();

        digit = Math.abs(digit);

        result = num > 0 ? num * 10 + digit : num * 10 - digit;

        System.out.printf("\nNumber => %d and Digit => %d", num, digit);
        System.out.printf("\nResult After Appending %d to %d => %d\n", digit, num, result);

        scanner.close();
    }
}



