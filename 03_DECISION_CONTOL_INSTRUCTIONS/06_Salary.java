 import java.util.*;
 
 class Salary {
    private static int salary;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the salary: ");
        int salary = sc.nextInt();

        if(salary>10000){
                salary+=2000;

        }else if(salary>5000){
            salary+=1500;

        }else{
            salary+=1000;
        }

        System.out.println("New salary ="+salary);



    }

    
}
