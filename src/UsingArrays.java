// Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;
public class UsingArrays {

    public static void main(String[] args) {//main method
        UsingArrays sa = new UsingArrays();//object creation
        sa.arrayString();
    }


    public void arrayString() {//instance method
        int[] arrays = {35000, 25000, 20000, 18000, 16000, 15000, 16500};//numeric numbers

        String[] arrays1 = {//strings
                "Pratiksha", "Ravibhai", "Ankita", "Nikita", "Preeti", "Lamee", "Sharddha"};


        System.out.println("Original numeric array : " + Arrays.toString(arrays));//original string
        Arrays.sort(arrays);
        System.out.println("Sorted numeric array : " + Arrays.toString(arrays));//sorted numeric arrays

        System.out.println("Original string array : " + Arrays.toString(arrays1));//original strings
        Arrays.sort(arrays1);
        System.out.println("Sorted string array : " + Arrays.toString(arrays1));//sorted strings


    }
}

