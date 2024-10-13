public class Problem2 {
    public static void main(String arg[]){
        int rows=4;
        int columns=5;
        for (int i = 0; i < rows; i++) {
            //inner loop
            for (int j = 0; j < columns; j++) {
                // Print '*' if it's the first or last row, or first or last column
                if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }

    }
}
/*
        (1,1)........(1,5)
            * * * * *
(2,1        *       * (2,5)
(3,1        *       * (3,5)
            * * * * *
        (4,1)........(4,5)
 */