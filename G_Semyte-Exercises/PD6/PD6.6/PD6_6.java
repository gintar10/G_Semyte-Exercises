package lt.techin.pd6;

public class PD6_6 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, -3, 1, 2, 3, 4, 3, 5, -10, 3, 134};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i] + " ");
        }
        System.out.println();
        int whileCounterIndex = 0;
        while(whileCounterIndex < numbers.length){
            System.out.println(numbers[whileCounterIndex] + " ");
            whileCounterIndex++;
        }
    }
}
