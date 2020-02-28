import java.util.Scanner;

public class MarkSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter student name");
        String name = sc.nextLine();
        System.out.println("Please enter Student Roll No");
        int roll_no = sc.nextInt();
        String[] sub = {"Maths", "Science", "English"};
        int marks[] = new int[3];
        float total = 0;
        double percent = 0;
        String grade = "", result = "";
        System.out.println("Enter marks of all subjects between 0 to 100");
        for (int i = 0; i < 3; i++){
            System.out.println(" Enter the marks for " + sub[i] +" ");
            marks[i] = sc.nextInt();
            total = total + marks[i];

        }
        percent = (total/300) * 100;
        System.out.println(" Dear" + name + " your Percentage is " + percent);
        if (percent >= 80){
            grade = "A+";
        } else if (percent >= 60 ){
            grade = "A";
        } else if (percent >= 50 ){
            grade = "B";
        }else if (percent >= 40){
            grade = "C";
        }

        if (percent >= 35){
            result = " Pass";
            System.out.println("Your grade is " + grade);
            System.out.println(" You are" + result);
        }
        else {
            result = " Fail";}
            System.out.println("You are" + grade);
            System.out.println(" ______________________ ");
            System.out.println("l                      l");
            System.out.println("l       Mark Sheet     l");
            System.out.println("l                      l");
            System.out.println(" ______________________ ");
            System.out.println("l  Name    :    Jay    l");
            System.out.println("l  Roll No :     08    l");
            System.out.println(" ______________________ ");
            System.out.println("   Math    :     98    l");
            System.out.println("   Science :     90    l");
            System.out.println("   English :     85    l");
            System.out.println(" ______________________ ");
            System.out.println("l  Total   :    273    l");
            System.out.println("l______________________l");
            System.out.println("l Percentage : 91.0    l");
            System.out.println("l  Result   :   Pass   l");
            System.out.println("l  Grade    :   A+     l");
            System.out.println("l                      l");
            System.out.println("________________________");

        }
    }

