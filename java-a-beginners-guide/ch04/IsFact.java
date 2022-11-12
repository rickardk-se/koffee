class Factor {
    boolean isFactor(int a, int b){
        return (b % a) == 0;
    }
}

class IsFact {
    public static void main(String[] args) {
        Factor x = new Factor();
        if(x.isFactor(2, 10 )) System.out.println("2 is a factor");
        if(x.isFactor(3, 10 )) System.out.println("3 is a factor");
        if(x.isFactor(5, 10 )) System.out.println("5 is a factor");
    }
}