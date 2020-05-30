class ThrowableTest {
    public static void main(String[] args) {
        try {
            f(0);
        } catch (ArithmeticException ex) {
            System.out.println("ex.getMessage(): " + ex.getMessage());
            System.out.println("ex.toString(): " + ex);
            System.out.println("ex.printStackTrace():");
            e.printStackTrace();
        }
    }

    static int f(int i) {
        return 10/i;
    }
}
