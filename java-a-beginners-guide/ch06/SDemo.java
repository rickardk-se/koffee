class StaticDemo {
    int x;
    static int y;

    int sum() {
        return x + y;
    }
}

class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        ob1.x = 10;
        ob2.x = 20;

        StaticDemo.y = 5;

        System.out.println("The sum of ob1 is: " + ob1.sum());
        System.out.println("The sum of ob2 is: " + ob2.sum());

        StaticDemo.y = 50;

        System.out.println("The sum of ob1 is: " + ob1.sum());
        System.out.println("The sum of ob2 is: " + ob2.sum());
    }
}