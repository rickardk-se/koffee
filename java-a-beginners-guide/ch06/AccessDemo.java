// Public vs private access
class MyClass { // a class is packaged private if not specified
    private int alpha;
    public int beta;
    int gamma; // this variable is also package private (default)

    /*  Methods to access. It's ok for a member
        of a class to access a private member
        of the same class.
     */

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.setAlpha(10);
        System.out.println("ob.alpha is " + ob.getAlpha());

        // This is ok since they are not private
        ob.beta = -99;
        ob.gamma = 100;
    }
}