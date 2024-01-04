package PD5;

public class PD5_3 {
    public static void main(String[] args) {
        int count;
        int i;
        int primenumber;

        System.out.println(" Prime Numbers : ");
        for(primenumber = 1; primenumber >= 1; primenumber++) {
            count = 0;
            for (i = 2; i <= primenumber/2; i++) {
                while (primenumber % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && primenumber != 1 ){
                System.out.print(primenumber + " ");
            }
        }
    }
}

