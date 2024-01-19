package lt.techin.pd7;

public class PD7_11 {
    public static void main(String[] args) {
        String myString = "I love eating cake";
        System.out.println(longesWordInLine(myString));
    }
    public static String longesWordInLine(String text) {
        String[] String = text.split(" ");
        String longestWord = String[0];
        for (String word : String) {
            if (word.length() > longestWord.length())
                longestWord = word;
        }
        return longestWord;
    }
}