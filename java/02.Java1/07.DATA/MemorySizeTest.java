public class MemorySizeTest {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        rt.gc();
        long[] frees = new long[8];
        Object[] objs = new Object[4];
        Object[][] objs2 = new Object[3][1000];
        int i;

        frees[0] = rt.freeMemory();
        objs[0] = new boolean[1000];
        frees[1] = rt.freeMemory();
        objs[1] = new int[1000];
        frees[2] = rt.freeMemory();
        objs[2] = new Object[1000];
        frees[3] = rt.freeMemory();
        objs[3] = new Integer[1000];
        frees[4] = rt.freeMemory();
        for(i = 0; i < 1000; i++)
            objs2[0][i] = new Object();
        frees[5] = rt.freeMemory();
        for(i = 0; i < 1000; i++)
            objs2[1][i] = new Integer(0);
        frees[6] = rt.freeMemory();
        for(i = 0; i < 1000; i++)
            objs2[2][i] = new Long(0);
        frees[7] = rt.freeMemory();

        System.out.println("size of boolean[1000] = " + (frees[0] - frees[1]));
        System.out.println("size of int[1000] = " + (frees[1] - frees[2]));
        System.out.println("size of Object[1000] = " + (frees[2] - frees[3]));
        System.out.println("size of Integer[1000] = " + (frees[3] - frees[4]));
        System.out.println("size of 1000 Object's = " + (frees[4] - frees[5]));
        System.out.println("size of 1000 Integer's = " + (frees[5] - frees[6]));
        System.out.println("size of 1000 Long's = " + (frees[6] - frees[7]));
    }
}
