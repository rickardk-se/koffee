class ArrayDemo {
    public static void main(String[] args) {
        int[] sample = new int[10];
        int i;

        for(i=0; i < 10; i++) {
            sample[i] = i*2;
        }

        for(i=0; i < 10; i++) {
            System.out.println("The value of element " + i + " is: " + sample[i]);
        }
    }
}