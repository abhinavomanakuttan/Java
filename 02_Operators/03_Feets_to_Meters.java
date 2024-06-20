import java.util.Scanner;

 class feet_to_Meter {
    public static final double FT_IN_1_MTR = 3.280839;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value in Feet to convert in Meters => ");
        float ft = scanner.nextFloat();
        
        float mtr = (float) (ft / FT_IN_1_MTR);
        
        System.out.printf("\n%.4f Feet = %.4f Meter\n", ft, mtr);
        
        scanner.close();
    }
}

