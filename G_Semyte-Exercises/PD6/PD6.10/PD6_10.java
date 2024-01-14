package lt.techin.pd6;

import java.util.Arrays;

public class PD6_10 {
    public static void main(String[] args) {
        int[] numbersArr1 = {1, 2, 3, 4, 5};
        int[] numbersArr2 = {3, 4, 5, 6, 7, 8};
        String[] chars = {"1", "2", "3", "4", "5", "6", "7", "8"};
        int[] sujungtasMasyvas = new int[numbersArr1.length + numbersArr2.length];

        String uniqueElementCounter = " ";
        int index = 0;

        for (int elArr1 : numbersArr1) {
            sujungtasMasyvas[index++] = elArr1;
        }
        for (int elArr2 : numbersArr2) {
            sujungtasMasyvas[index++] = elArr2;
        }
        System.out.println(Arrays.toString(sujungtasMasyvas));

        for (int i = 0; i < chars.length; i++){
            boolean isDuplicate = false;
            for (int j = i + 1; j < chars.length; j++){
                if (chars[i].equalsIgnoreCase(chars[j])){
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate){
            }
        }
        System.out.println(uniqueElementCounter);
        System.out.println(Arrays.toString(chars));
    }
}
