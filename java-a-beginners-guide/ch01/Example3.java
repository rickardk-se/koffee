/*
    This program illustrates the differences
    between int and double
 */

class Example3 {
    public static void main(String[] args) {
        int v;      // This declares an integer variable
        double x;   // This declares a floating-point variable

        v = 10;     // Assign the integer 10
        x = 10.0;   // Assign the floating-point 10.0

        System.out.println("Original value of v: " + v);
        System.out.println("Original value of x: " + x);
        System.out.println(); // print a blank line

        // Divide both values by 4
        v = v / 4;
        x = x / 4;

        // Print new values
        System.out.println("New value of v: " + v);
        System.out.println("New value of x: " + x);

    }
}