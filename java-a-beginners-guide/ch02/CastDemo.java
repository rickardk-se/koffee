class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x/y); //cast double to int
        System.out.println("Integer outcome of x/y: " + i);

        i = 100;
        b = (byte) i; // No loss here, a byte can hold the vaule 100
        System.out.println("Value of b: " + b);

        i = 258;
        b = (byte) i; // Loss here a byte cannot hold the vaule 257
        System.out.println("Value of b: " + b);

        b = 88;
        ch = (char) b;
        System.out.println("Value of ch: " + ch);
    }
}
