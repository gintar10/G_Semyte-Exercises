

package lt.techin.pd6;

import java.util.Arrays;

public class PD6_1 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, -10};
        int[] clonedArray = new int[originalArray.length];
        for(int i = 0; i < originalArray.length; i++){
            clonedArray[i] = originalArray[i];
        }

        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(clonedArray));
    }
}
