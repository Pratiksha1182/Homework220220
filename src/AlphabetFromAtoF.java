// 8. Input any alphabet from a to f and print their city name accordingly (use if else) any other         Alphabet should be invalid entry

import java.util.Scanner;

public class AlphabetFromAtoF {
    public static void main(String[] args){
        String alphabet;
        Scanner s1= new Scanner(System.in);
        System.out.println("Please any alphabet between a and f");
        alphabet = s1.next();
        alphabet = alphabet.toUpperCase();
        alphabet = alphabet.toLowerCase();
        if (alphabet.equals("a")){
            System.out.println(" City name is Ahmedabad ");
        }else if (alphabet.equals("b")){
            System.out.println("  City name is Baroda");
        }else if (alphabet.equals("c")) {
            System.out.println(" City name is Chandigarh ");
        }else if (alphabet.equals("d")) {
            System.out.println(" City name is Delhi ");
        }else if (alphabet.equals("e")){
            System.out.println(" City name is Etava ");
        }else if (alphabet.equals("f")) {
            System.out.println(" City name is Faridabad ");
        }


    }

}

