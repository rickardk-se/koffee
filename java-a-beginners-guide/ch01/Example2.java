/*
    This program demonstrates the use of a variable
 */

class Example2 {
    public static void main(String[] args) {
        // int myVar1, myVar2; // both declared using one statement
        int myVar1; // This decalares a variable
        int myVar2; // This declares a second variable
        myVar1 = 1024; // Assign a value to myVar1

        System.out.println("myVar1 contains " + myVar1);

        myVar2 = myVar1 / 2;

        System.out.print("myVar2 contains myVar1 / 2: ");
        System.out.println(myVar2);
    }
}