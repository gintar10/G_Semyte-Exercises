package PD5;

public class PD5_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == 5) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



        for (int a = 1; a <= 5; a++){
            for (int b = 1; b <= 8; b++){
                if (a == 1 || a == 5 || b == 1 || b == 8){
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }



        for (int k = 1; k <= 5; k++){
            for (int d = 1; d <= 5; d++){
                if (k == 1 || k == 5 || d == 1 || d == 5){
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
