/*
    Calculate the number of cube inches
    in 1 cubic mile.
 */

class Inches {
    public static void main(String[] args) {
        // We need long values otherwise we will get an incorrect answer.
        long ci;
        long im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in a cubic mile");
    }
}