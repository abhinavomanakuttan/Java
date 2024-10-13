public class Problem4 {
    public static void main(String[] arg){
        int n=5;
        //outer loop
        for (int i=n;i>=1;i--){
            // i -> starts from n=5  to i-- ->0
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
/*

 * * * * *  n=5
 * * * *    n=4
 * * *      n=3
 * *        n=2
 *          n=1

 n=n-1

 */