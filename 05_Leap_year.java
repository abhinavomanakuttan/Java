
// To check whether a given year is a leap year or not

import java.util.*;
class Leap_year {
    public static void main(String[] args) {
        System.out.println("Enter the year ");
        Scanner input=new Scanner(System.in);

        int year=input.nextInt();

        if(year % 400 ==0){
            System.out.println(year+" is Leap Year");
        }
        if (year %100==0) {
            System.out.print(year+" is  Leap Year");
            
        }
        if(year%4==0){
            System.out.print(year+" is  Leap Year");

        }
    else{
        System.out.print(year+" is not Leap Year");
    }
        



    }
    
}
