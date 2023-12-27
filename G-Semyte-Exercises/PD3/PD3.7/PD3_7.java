package PD3;

public class PD3_7 {
    public static void main(String[] args) {
        String text1 = "Miske";
        String text2 = "Gyvena";
        String text3 = "Baltas";
        String text4 = "Zuikis";

        String mySentence = text1 + text2 + text3 + text4;
        System.out.println(mySentence);
        System.out.println(mySentence.length());
        System.out.println(text1.equals(text2));
        System.out.println(text3.equals(text4));

        String upperCase = text1.toUpperCase() + text2.toUpperCase() + text3.toUpperCase() + text4.toUpperCase();
        System.out.println(upperCase);

        String lowerCase = text1.toLowerCase() + text2.toLowerCase() + text3.toLowerCase() + text4.toLowerCase();
        System.out.println(lowerCase);

        char charAt = text1.charAt(0);
        System.out.println(charAt);

        String subStr = text4.substring(1, 4);
        System.out.println(subStr);
    }
}
