package PD3;

public class PD3_5 {
    public static void main(String[] args) {
        double myDouble2 = 49;
        float myFloat3 = 7.8f;
        long myLong2 = 111563428;
        int myInt1 = 39;

        float myIntToFloat = (float) myInt1;
        int myDoubleToInt = (int) myDouble2;
        double myLongToDouble = (double) myLong2;
        long myFloatToLong = (long) myFloat3;

        System.out.println("int to float" + myIntToFloat);
        System.out.println("double to int" + myDoubleToInt);
        System.out.println("long to double" + myLongToDouble);
        System.out.println("float to long" + myFloatToLong);
    }
}
