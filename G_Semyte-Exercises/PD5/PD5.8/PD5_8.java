package PD5;

import java.util.Scanner;

public class PD5_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Įveskite kuro bako talpą: ");
        int BakoTalpa = scanner.nextInt();

        System.out.print("Įveskite kuro sąnaudas n: ");
        int sanaudos = scanner.nextInt();

        int kelione = BakoTalpa;
        int dienos = 0;

        while (kelione >= 0) {
            dienos++;
            kelione -= (dienos % 2 == 0) ? sanaudos  : sanaudos * 2;
        }
        System.out.println("Keliauti bus galima " + dienos + " dienas.");
    }
}



