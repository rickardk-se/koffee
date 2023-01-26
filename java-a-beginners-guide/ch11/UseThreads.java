class MyThread implements Runnable{
    String thrdName;

    public MyThread(String thrdName) {
        this.thrdName = thrdName;
    }

    public void run() {
        System.out.println(thrdName + " starting");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrdName + ", count is " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }

}

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread mt = new MyThread("Rickards thread");

        Thread newThrd = new Thread(mt);

        newThrd.start();

        for(int i=0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread stopped");
    }
}
