class Overload {
    void ovlDemo() {
        System.out.println("No paramenters");
    }

    void ovlDemo(int a){
        System.out.println("One parameter: " + a);
    }

    int ovlDemo(int a, int b){
        System.out.println("Two ints");
        return a + b;
    }

    double ovlDemo(double a, double b) {
        System.out.println("Two doubles");
        return a + b;
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        int resD;

        ob.ovlDemo();
        ob.ovlDemo(2);
        ob.ovlDemo(2,3);
        ob.ovlDemo(2.1,3.0);
    }
}