package lt.techin.pd6;

public class PD6_14 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {10, 1, 20, 30, 40, 50};
        Boolean hasCommonElement = false;
        for (int number1 : numbers1) {
            for (int number2 : numbers2) {
                if (number1 == number2) {
                    hasCommonElement = true;
                    break;
                }
            }
        }
        System.out.println(hasCommonElement);
    }
}
