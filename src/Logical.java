public class Logical {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        System.out.println((a > 3) && (b > 5));
        System.out.println((a > 3) && (b < 5));

        System.out.println((a < 3) || (b > 5));
        System.out.println((a > 3) || (b < 5));
        System.out.println((a < 3) || (b < 5));

        System.out.println(!(a == 3));
        System.out.println(!(b > 3));
    }
}
