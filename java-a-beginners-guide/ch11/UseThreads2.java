class MyThread implements Runnable{

    Thread thrd;

    public MyThread(String name) {
        thrd = new Thread(this, name);
    }

    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);
        myThrd.thrd.start();
        return myThrd;
    }

    public void run() {
        System.out.println(thrd.getName() + " starting");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }

}

public class UseThreads2 {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread mt = MyThread.createAndStart("Rickards Thread");


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
