package lt.techin.pd7;

public class PD7_7 {
    public static void main(String[] args) {
        int number = 54;
        System.out.println(number);
        System.out.println(reverseNumber(number));
    }

    public static int reverseNumber(int number) {
        int reverved = 0;
        while(number != 0) {
            int remainder = number % 10;
            reverved = reverved * 10 + remainder;
            number = number / 10;
        }
        return reverved;
    }
}
