// Define variable that is already defined (won't compile)

class NestVar {
    public static void main(String[] args) {
        int count;

        for(count = 0; count < 10; count++){
            System.out.println("This is count: " + count);
            int count = 5;

            for(count = 0; count < 2; count++){
                System.out.println("count is now: " + count);
            }

        }
    }
}