class Vehicle {
    private int passengers; // number of passengers
    private int fuelcap;    // fuel capacity in gallons
    private int mpg;        // fuel consumption in miles per gallon

    // Cnstructor
    Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    int range() {
        return fuelcap * mpg;
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

    int getPassengers() {
        return passengers;
    }

    void setPassengers(int p){
        passengers = p;
    }

    int getFuelcap() {
        return fuelcap;
    }

    void setFuelcap(int f) {
        fuelcap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }
}

class Truck extends Vehicle {
    private int cargocap; // cargo capacity in pounds

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    int getCargocap() {
        return cargocap;
    }

    void setCargocap(int c){
        cargocap = c;
    }
}

class TruckDemo {
    public static void main(String[] args) {

        Truck semi = new Truck(2, 200,7, 44000);
        Truck pickup = new Truck(3, 28,15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);
        System.out.println("Semi can carry " + semi.getCargocap() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fule.\n");

        gallons = pickup.fuelNeeded(dist);
        System.out.println("Pickup can carry " + pickup.getCargocap() + " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of fule.\n");
    }
}