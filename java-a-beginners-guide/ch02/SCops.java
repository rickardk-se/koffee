// Short-circuit operations to prevent division by zero error

class SCops {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;

        if( d != 0 && (n % d) == 0) System.out.println(d + " is a factor of " + n);

        // setting d to zero to test short circuit (conditional AND)
        d = 0;
        if( d != 0 && (n % d) == 0) System.out.println(d + " is a factor of " + n);

        System.out.println("Conditional AND worked well.");

        if( d != 0 & (n % d) == 0) System.out.println(d + " is a factor of " + n);

    }
}