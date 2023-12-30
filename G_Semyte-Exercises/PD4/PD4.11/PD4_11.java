package PD4;

import java.util.Scanner;

public class PD4_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek žuvų gyvena akvariume? ");
        int ZuvuSkaicius = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Kiek žuvų į akvariumą įdedama kiekvieną dieną? ");
        int ZuvysKiekvienaDiena = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Kiek dienų praėjo? ");
        int Dienos = scanner3.nextInt();

        int Kiekis = ZuvuSkaicius + (ZuvysKiekvienaDiena * ZuvysKiekvienaDiena);

        System.out.println("Po" + " " + Dienos + " " + "dienu akvariume gyvens" + " " + Kiekis + " " + "zuvu");
    }
}
