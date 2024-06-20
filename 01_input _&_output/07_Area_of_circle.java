 import java.util.Scanner;
 class Area_of_circle {
    public static void main(String[] args) {
        float area, radius;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radious of circle");
        radius=s.nextFloat();

        area=3.14f*radius*radius;

        System.out.printf("Area of Circle is %.2f having Radius %.2f%n", area, radius);;

      

    }
    
}
