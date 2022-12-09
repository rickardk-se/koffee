class CLDemo {
    public static void main(String[] args) {

        System.out.println("There are " + args.length + " arguments provided.");

        // for-each loop
        for(String x: args) {
            System.out.println(x);
        }

        //for loop
        for(int y = 0; y < args.length; y++){
            System.out.println(args[y]);
        }
    }
}