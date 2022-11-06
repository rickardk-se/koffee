class DtoL {
    public static void main(String[] args) {
        long L;
        double D;

        D = 100123285.0;

        // won't compile - error: incompatible types: possible lossy conversion from double to long
        L = D;
    }
}