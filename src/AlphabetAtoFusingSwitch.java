// Alphabet a to f using switch

import java.util.Scanner;

public class AlphabetAtoFusingSwitch {
    public static void main(String[] args) {
            String alphabet;
            Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter any alphabet between a and f");
        alphabet = s1.next();
        alphabet = alphabet.toUpperCase();
        alphabet = alphabet.toLowerCase();

            switch (alphabet){
                case "a":
                    System.out.println("City name is Ahmedabad");
                case "b":
                    System.out.println("City name is Baroda");
                    break;
                case "c":
                    System.out.println("City name is Chandigarh");
                    break;
                case "d":
                    System.out.println("City name is Delhi");
                    break;
                case "e":
                    System.out.println(" City name is Etava");
                    break;
                case "f":
                    System.out.println("City name is Faridabad");
                    break;
                default:
                    System.out.println("Input is not valid");

            }
        }
    }

