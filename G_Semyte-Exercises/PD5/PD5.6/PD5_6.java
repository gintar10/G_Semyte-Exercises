package PD5;

import java.util.Scanner;

public class PD5_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek eglučių atvežta?");
        String EgluciuSkaicius = scanner.nextLine();

        int skaicius = Integer.parseInt(EgluciuSkaicius);
        int Kiekis = 0;
        double Sum = 0;

        do {
            Kiekis += 1;
            System.out.println("Įveskite"+" "+ Kiekis +" "+"eglutės aukštį:" );
            String EgluciuAukstis = scanner.nextLine();

            double Aukstis = Double.parseDouble(EgluciuAukstis);
            Sum += Aukstis;
        }
        while (Kiekis != skaicius);

        double vidurkis = Sum / Kiekis;
        System.out.println("Eglutės aukščio vidurkis:" + " " + vidurkis + " cm");
    }
}






