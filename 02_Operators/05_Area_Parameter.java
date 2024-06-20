
import java.util.Scanner;

class RectangleCalculator {
    public static void main(String[] args) {
        float area, perimeter, l, b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Length and Breadth of A Rectangle => ");
        l = scanner.nextFloat();
        b = scanner.nextFloat();

        area = l * b;
        perimeter = 2 * (l + b);

        System.out.printf("\nArea of Rectangle => %.2f", area);
        System.out.printf("\nPerimeter of Rectangle => %.2f", perimeter);

        scanner.close();
    }
}

