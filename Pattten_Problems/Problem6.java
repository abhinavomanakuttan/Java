public class Problem6 {
    public static void main(String ar[]){
        int n=5;
        //outer loop
        for(int i=1;i<=n;i++){
            //Inner loop->space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop
            for (int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
