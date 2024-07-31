import java.util.*;
 class Reverse{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter  number ");
        int num=sc.nextInt();

        System.out.println("Before Reversing: "+num);

        int res=0;

        while(num>0){                // if num=456
            int rem=num%10;          // rem=6
        
            num=num/10;             // 45

             res=res* 10 +rem;      //res=0*10+6 {case 1 }

        }
        
        System.out.println("After reversing "+res);

        
    }
    
}
