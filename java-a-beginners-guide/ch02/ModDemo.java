// Demonstrate modulus operator %

class ModDemo {
    public static void main(String[] args) {
        int dividend = 100;
        int divisor = 6;

        int remainder = dividend % divisor;

        int result = dividend / divisor;

        System.out.println(dividend + " divided by " + divisor + " equals " + result + " with remainder " + remainder );
    }
}