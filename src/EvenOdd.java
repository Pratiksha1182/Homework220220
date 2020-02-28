//WAP to input any number and find out if it’s odd or even//

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Print any number");
        int number = sc.nextInt();
        int rem = number%2;
        if (rem == 0){
            System.out.println(" You have Enter " + number);
            System.out.println( number+ " is even");
        }
        else{
            System.out.println("You have Enter " + number);
            System.out.println( number+" is odd");
        }
    }
}
