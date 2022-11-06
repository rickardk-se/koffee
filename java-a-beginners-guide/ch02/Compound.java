/*
    Test compound assignments
 */

class Compund {
    public static void main(String[] args) {
        int a = 10;
        boolean b = false;

        a /= 2;
        b |= true;
        System.out.println(a);
        System.out.println(b);

        a *= 3;
        b ^= true;
        System.out.println(a);
        System.out.println(b);

        a %= 4;
        b &= true;
        System.out.println(a);
        System.out.println(b);

    }
}