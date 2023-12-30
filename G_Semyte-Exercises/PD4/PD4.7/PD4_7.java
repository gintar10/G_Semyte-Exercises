package PD4;

import java.util.Scanner;

public class PD4_7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek paskaitu yra pirmadieni ");
        int p = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Kiek paskaitu yra antradieni ");
        int a = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Kiek paskaitu yra treciadieni ");
        int t = scanner3.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Kiek paskaitu yra ketvirtadieni ");
        int k = scanner4.nextInt();

        Scanner scanners5 = new Scanner(System.in);
        System.out.println("Kiek paskaitu yra penktadieni ");
        int pnk = scanners5.nextInt();

        double savaite = p + a + t + k + pnk;
        System.out.println("Paskaitu skaicius per savaite -" + " " + savaite);

        double minutes = savaite * 45;
        System.out.println("Tai sudaro" + " " + minutes + " " + "minuciu");
    }
}
