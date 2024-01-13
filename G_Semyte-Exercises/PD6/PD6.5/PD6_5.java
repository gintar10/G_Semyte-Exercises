package lt.techin.pd6;

public class PD6_5 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, -3, 1, 2, 3, 4, 3, 5, -10, 3, 134};
        int min = numbers[0];
        int max = numbers[0];

        for (int element : numbers) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}