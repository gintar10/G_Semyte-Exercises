package PD4;

import java.util.Scanner;

public class PD4_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sienos ilgis m: ");
        String ilgis = scanner.nextLine();

        System.out.println("Sienos aukštis m: ");
        String aukstis = scanner.nextLine();

        System.out.println("Plytos kaina Eur: ");
        String kaina = scanner.nextLine();
        System.out.println(kaina);

        int ilgis1 = Integer.parseInt(ilgis);
        int aukstis1 = Integer.parseInt(aukstis);
        double kaina1 = Double.valueOf(kaina);

        int s = (ilgis1 * aukstis1) * 10000;
        int kiekis = s / (20 * 10);

        System.out.println("Plytų kiekis" + " " + kiekis);

        double kainuos = kiekis * kaina1;
        System.out.println("Plytos kainuos" + " " +kainuos+ " " + "Eur");
    }
}
