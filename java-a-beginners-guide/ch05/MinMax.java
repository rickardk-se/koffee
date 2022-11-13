class MinMax {
    public static void main(String[] args) {
        int[] myarray = {12,-10,8888,3,-1000};
        int min, max;
        min = myarray[0];
        max = myarray[0];

        for(int x=0; x < myarray.length; x++) {
            if(myarray[x] < min) min = myarray[x];
            if(myarray[x] > max) max = myarray[x];
        }
        System.out.println("Minimum value is: " + min);
        System.out.println("Maximum value is: " + max);
    }
}