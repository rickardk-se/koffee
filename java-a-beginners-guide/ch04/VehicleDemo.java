class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan;
        minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // compute range
        range = minivan.fuelcap * minivan.mpg;

        System.out.println("Minivan can carry " + minivan.passengers + " passengers with a range of " + range + " miles.");
    }
}
