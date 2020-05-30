class ExceptTest {
    public static void main(String[] args) {
        try {
            int i = sumDivideDiff(8, 4)
                    + sumDivideDiff(3, 3);
            System.out.println("result = " + i);
        }
        catch (ArithmeticException ex) {
            System.out.println(
                "value of i is not calculated: "
                + ex.getMessage());
        }
        System.out.println("End of main()");
    }

    public static int sumDivideDiff(int x, int y) {
        int result = (x + y) / (x - y);
        System.out.println(
            "sumDivideDiff(" + x + "," + y + ") = " + result);
        return result;
    }
}
