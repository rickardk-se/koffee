class Queue {
    char[] q; // array of characters for the queue
    int putloc, getloc; // the get and put indices

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    // put a character into the queue
    void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // get a character from the queue
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }

        return q[getloc++];
    }
}

class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");

        for(i=0; i < 26; i++) bigQ.put((char) ('A' + i));

        // retreive elements from bigQ
        System.out.print("Contents of bigQ: ");
        for(i=0; i < 26; i++){
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate some errors.");

        for(i=0; i < 5; i++) {
            System.out.println("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
        }

        // more errors on smallQ
        System.out.println("Contents of smallQ: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
    }
}