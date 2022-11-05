/*
    This program converts gallons to liters
 */

class GalToLit {
    public static void main(String[] args) {
        double liters;
        double gallons;

        gallons = 10;
        liters = gallons * 3.8754; // 1 gallon equals 3.8754 liters

        System.out.println(gallons + " gallons equals " + liters + " liters");

    }
}