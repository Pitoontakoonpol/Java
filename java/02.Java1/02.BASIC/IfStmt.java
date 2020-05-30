class IfStmt {
    public static void main(String[] args) {
        f(6);
    }

    static void f(int i) {
        if (i%2 == 0)
            System.out.println("Even Number");
        if (i%3 == 0) {
            System.out.println("3 times");
            System.out.println("i = " + i);
        }
        if (i%5 == 0)
            System.out.println("5 times");
        else if (i % 5 == 1)
            System.out.println("5 times + 1");
        else
            System.out.println("default");
    }
}
