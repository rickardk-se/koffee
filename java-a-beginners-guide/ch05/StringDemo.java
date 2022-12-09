class StringDemo {
    public static void main(String[] args) {
        String str1 = new String("Java strings are objects.");
        String str2 = new String(str1);
        String str3 = "The are constructed in different ways.";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}