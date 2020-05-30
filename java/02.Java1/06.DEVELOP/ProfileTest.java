class ProfileTest {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        for(int i = 1; i <= 100; ++i) {
            calc1(100);
            calc2(100);
        }
        long t2 = System.currentTimeMillis();
        System.out.println( t2 - t1 + " mills for main()" );
    }
        
    public static void calc1(int n) {
        double sum = 0;
        for (int j = 0; j < 10; ++j) {
            sum += Math.random();
        }
    }

    public static void calc2(int n) {
        double sum = 0;
        for (int j = 0; j < 10; ++j) {
            sum += Math.random();
        }
    }
}
