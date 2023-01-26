class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " starting");
        try {
            for(int count=0; count < 10; count++) {
                sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }

        System.out.println(getName() + " terminating.");
    }
}

class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        MyThread mt = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");
        mt.start();
        mt2.start();
        mt3.start();
        try {
            mt.join();
            System.out.println("Child #1 joined.");
            mt2.join();
            System.out.println("Child #2 joined.");
            mt3.join();
            System.out.println("Child #3 joined.");
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ending.");
    }
}