package lt.techin.pd6;

import java.util.Arrays;

public class PD6_11 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.sort(originalArray);

        System.out.println("Sorted array: " + Arrays.toString(originalArray));
        System.out.println("The 3rd smallest: " + originalArray[2]);
    }
}


