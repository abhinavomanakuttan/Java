import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your RollNo: ");

        int rollno=input.nextInt(); //nextInt() use for identify the given element is integer 

        System.out.println("Enter your name: ");
        
        String name=input.next(); //here it will recive only the first string 
                                 // if you want to recive your full name ==> input.nextLine()
        System.out.println("Enter your full name:");
        String fullname=input.nextLine();


        System.out.println("Your roll no is " + rollno);
        System.out.println("Your Name is "+ name);
        System.out.println("Your full name is "+fullname);

        
    }
}