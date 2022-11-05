/*
    This program demontstrate basic if statement
    < less than
    <= less than or equal to
    > greather than
    >= greater than or equeal to
    == equal to
    != not equal to
 */

class IfDemo{
    public static void main(String[] args) {
        int a,b,c;

        a = 2;
        b = 3;

        if(a < b) System.out.println("a is less than b");

        if(a == b) System.out.println("a and b are equal");

        c = a -  b;

        if (a > c) System.out.println("a is greater than c");

        if (c < 0) System.out.println("c is negative");

    }
}