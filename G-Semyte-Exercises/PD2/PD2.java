package PD2;

import java.util.Scanner;

public class PD2 {
    public static void main(String[] args) {

        System.out.println("Welcome to Java");
        System.out.println("Learning Java Now");
        System.out.println("Programming is fun");


        System.out.println();
        System.out.println("J     A     V     V     A");
        System.out.println("J    A A     V   V     A A");
        System.out.println("J   A A A     V V     A A A");
        System.out.println("J  A     A     V     A     A");


        System.out.println( "a    a^2    a^3    a^4" );
        System.out.println( "----------------------" );
        System.out.println( "1    1      1      1" );
        System.out.println( "2    4      8      16" );
        System.out.println( "3    9      27     81" );
        System.out.println( "4    16     64     256");


        System.out.println("Please enter your name:");

        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Sveiki, " + name);


        int num1 = 20;
        int num2 = 10;
        int result1 = num1 / num2;
        int result2 = num1 * num2;
        int result3 = num1 + num2;
        int result4 = num1 - num2;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


        // int num1 = 20 (a one line comment)
        /* A multi line comment
        int result1 = num1 / num2;
        int result2 = num1 * num2;
        int result3 = num1 + num2;
        int result4 = num1 - num2; */





    }
}


