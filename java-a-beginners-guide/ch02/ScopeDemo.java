class ScopeDemo {
    public static void main(String[] args) {
        int x; // scope is main

        x = 10;
        if (x == 10) { // start a new scope
            int y = 20; // known only to this block

            // x and y are both known here
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Error! y is not known here


        // x is still known here
        System.out.println("x is " + x);
    }
}
