class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    void range() {
        System.out.println("Range is " + fuelcap * mpg);
    }
}

class VehicleDemo2 {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + " passengers. ");
        minivan.range();
        System.out.print("Sportscar can carry " + sportscar.passengers + " passengers. ");
        sportscar.range();
    }
}
