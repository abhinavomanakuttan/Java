
import java.util.Scanner;

 class Nested_Switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.err.println("Enter employ ID");
        int empID=in.nextInt();
        System.err.println("Enter Department ");
        String department=in.next();

        switch (empID) {
            case 1:
                System.out.println("Abhinav ");  

                switch(department){
                    case "It":
                        System.out.println("IT Department");
                    break;

                    case "CS":
                        System.err.println("Computer Science:");
                    break;

                }

            break;
            
            case 2:
                System.out.println("rahul ");
                switch(department){
                        case "It":
                            System.out.println("IT Department");
                        break;

                        case "CS":
                            System.err.println("Computer Science:");
                        break;

                    }


                break;
                case 3:
                    switch(department){
                        case "It":
                            System.out.println("IT Department");
                        break;

                        case "CS":
                            System.err.println("Computer Science:");
                        break;

                    }
                    break;
            default:
                System.err.println("Enter corect emoply id ");
        }
    }
    
}
