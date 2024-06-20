
import java.util.Scanner;
class cel_to_fah {
    public static void main(String[] args) {

        float cel ,fah;
        Scanner ce=new Scanner(System.in);
        System.out.print("Convert Celcius to Fahrenheit:");

       

        System.out.println("Celcius = ");
        cel=ce.nextFloat();
        fah=cel*9 / 5 +32;

        System.out.printf("%.2f Celsius =%.2f \n fahrenheit \n ",cel,fah);
        ce.close();


    }
}
