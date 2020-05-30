class SumDivideDiffException extends Exception {
    public int x, y;
    SumDivideDiffException(int x, int y) {
        super("SumDivideDiff Exception");
        this.x = x;
        this.y = y;
    }
}

class ThrowTest {
    public static void main(String[] args) {
        try {
            int i = sumDivideDiff(8, 4) + sumDivideDiff(3, 3);
            System.out.println("result = " + i);
        } catch (SumDivideDiffException ex) {
            System.out.println(
                "value of i is not calculated: " + ex.getMessage()
                + "(" + ex.x + ", " + ex.y + ")");
        }
        System.out.println("End of main()");
    }
    public static int sumDivideDiff(int x, int y)
        throws SumDivideDiffException {
        if (x == y)
            throw new SumDivideDiffException(x, y);
        return (x + y) / (x - y);
    }
}
