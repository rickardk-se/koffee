class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    Vehicle(int x, int y, int z) {
        passengers = x;
        fuelcap = y;
        mpg = z;
    }

    int range() {
        return fuelcap * mpg;
    }
}

class VehConsDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);

        int range1, range2;

        System.out.println("Minivan can carry " + minivan.passengers + " passengers with a range of " + minivan.range() + " miles.");
        System.out.println("Sportscar can carry " + sportscar.passengers + " passengers with a range of " + sportscar.range() + " miles.");
    }
}
