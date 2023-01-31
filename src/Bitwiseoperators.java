public class Bitwiseoperators {
    public static void main(String[] args) {

        int a = 4;
        int b = 6;


        System.out.println("a&b = " + (a & b));
        System.out.println("a|b = " + (a | b));
        System.out.println("a^b = " + (a ^ b));
        System.out.println("~a = " + ~a);
        a &= b;
        System.out.println("a= " + a);
    }
}

