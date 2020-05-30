public class FinalizeTest {
    int i;
    public FinalizeTest(int i) {
        this.i = i;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize(): i = " + i);
        System.out.flush();
    }

    public static void main(String[] args) throws Throwable {
        create();
        System.gc();
        System.runFinalization();
    }

    public static void create() {
        FinalizeTest obj1 = new FinalizeTest(1);
        obj1 = null;
    }
}
