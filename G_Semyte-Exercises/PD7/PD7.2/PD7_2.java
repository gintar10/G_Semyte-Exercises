package lt.techin.pd7;

public class PD7_2 {
    public static void main(String[] args) {
        System.out.println(convertCelToFar(15.6));

    }
    public static double convertCelToFar(double temperature) {
        return (temperature * 1.8) + 32;
    }
}
