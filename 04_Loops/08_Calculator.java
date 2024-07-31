
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Take input from user till doesnot pass X or x
        int ans=0;

        while(true){
            //Take the operators as input 
            System.out.println("Enter the operator \nEnter x to Stop\n ");

            char op=in.next().trim().charAt(0);
            if(op=='+' || op== '-'|| op=='/' || op=='%' || op=='*' ){
                //input 2 numbers from user 
                System.out.println("Enter two numbers");
                int num1=in.nextInt();
                int num2=in.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                    
                }
                else if (op=='-') {
                    ans=num1-num2;
                    
                }else if(op=='/'){
                    if(num2!=0){
                    ans=num1/num2;
                }

                    }
                    
                else if(op=='%'){
                    ans=num1%num2;

                }else if(op=='*'){
                    ans=num1*num2;
                }



            }
            else if(op=='x'||op=='X'){
                break;

            }else{
                System.out.print("Invalid intex / operater: ");
            }
            System.out.println("Answer: "+ans);
        }

    }
    
}
