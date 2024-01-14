package lt.techin.pd6;

import java.util.Arrays;

public class PD6_8 {
    public static void main(String[] args) {
        String[] chars = {"A", "a", "C", "c", "D", "d", "F", "f", "H", "h"};
        String[] newChars = new String[chars.length];
        int uniqueElementCounter = 0;

        for (int i =0; i < chars.length; i++){
            boolean isDuplicate = false;
            for (int j = i + 1; j < chars.length; j++){
                if (chars[i].equalsIgnoreCase(chars[j])){
                   isDuplicate = true;
                   break;
                }
            }
            if (isDuplicate){
                newChars[uniqueElementCounter] = chars[i];
                uniqueElementCounter++;
            }
        }
        System.out.println(uniqueElementCounter);
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(newChars));
    }
}
