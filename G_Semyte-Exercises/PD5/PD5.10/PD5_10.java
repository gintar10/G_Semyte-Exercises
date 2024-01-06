package PD5;

public class PD5_10 {
    public static void main(String[] args) {

        int n = 30;
        int m = 40;

        for (int i = n; i <= m; i++) {
            if (i % n != 3 & i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
