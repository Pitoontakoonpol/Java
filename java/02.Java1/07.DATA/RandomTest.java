class RandomTest {
    public static void main(String[] args) {
        java.util.Random r = new java.util.Random();
        System.out.println(r.nextDouble());
        java.util.Random r2 = new java.util.Random(100);
        System.out.println((int) (r2.nextDouble() * 10));
        System.out.println((int) (r2.nextDouble() * 10));
        System.out.println((int) (r2.nextDouble() * 10));
    }
}
