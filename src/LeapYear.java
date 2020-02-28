//WAP to input any year like (ex.2007) and find out if it is leap year or not?


import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter year");
        int year = sc.nextInt();
        boolean result = false;
        if (year % 400 ==0) {
            result = true;
        }else if (year % 100 == 0){
            result = false;
        }else if (year % 4 == 0){
            result = true;
        }else {
            result = false;
        }if (result){
            System.out.println("Year" + year + " is a leap year");
        }else{
            System.out.println("year " + year + " is not a leap year");
        }
    }

}