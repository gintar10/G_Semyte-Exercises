package PD3;

public class PD3_4 {
    public static void main(String[] args) {
        boolean c = true;
        boolean d = false;
        System.out.println(c && c);
        System.out.println(c && d);
        System.out.println(d && c);
        System.out.println(d && d);

        System.out.println(c || c);
        System.out.println(c || d);
        System.out.println(d || c);
        System.out.println(d || d);

        System.out.println (!c);
        System.out.println (!d);
    }
}
