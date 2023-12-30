package PD4;

import java.util.Scanner;

public class PD4_10 {

    public static void main(String[] args) {

        int TunelioIlgis = 264;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Koks automobilio greitis?: ");

        double Greitis = scanner.nextInt();

        System.out.println(TunelioIlgis + " " + "m.");

        double laikas = (TunelioIlgis * Greitis) / 1000;
        System.out.println("Automobilis tunelį pravažiuos per" + " " + laikas +  "s");
    }
}
