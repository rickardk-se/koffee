

class Bubble {
    public static void main(String[] args) {
        int[] nums = {99, -10, 7, 100012, 43, -98, -109, 5444, 32768, 10};
        int a, b, t;
        int size;

        size = 10; // number of elements to sort

        // print original
        System.out.print("The original array is: ");
        for(int i=0; i < size; i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        // This is the bubble sort
        for(a=1; a < size; a++) {
            for(b=size-1; b >= a; b--){
                if(nums[b-1] > nums[b]) { // if out of order
                    // exchange elements
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        // print sorted
        System.out.print("The original array is: ");
        for(int i=0; i < size; i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }
}