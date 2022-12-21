class VarArgs {
    static void vaTest(int ... v) {
        System.out.println("Number of arguments: " + v.length);
        System.out.println("Contents:");

        // Using a for-each loop
        for(int arg: v){
            System.out.println("  " + arg);
        }
    }

    public static void main(String[] args) {
        vaTest(10); // 1 arg
        vaTest(11,22,33); // 3 args
        vaTest(); // no args
    }
}

