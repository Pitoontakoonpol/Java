public class MemoryTest
{
    public static void main( String[] args )
    {   Runtime rt = Runtime.getRuntime();
        System.out.println(rt.totalMemory() + ":" + rt.freeMemory());

        alloc(10000000);
        System.out.println(rt.totalMemory() + ":" + rt.freeMemory());

        alloc(20000000);  // ���� �Ҵ�� �޸� �ʰ��� ���� ������ ����
        System.out.println(rt.totalMemory() + ":" + rt.freeMemory());
        System.gc();      // ���α׷��� ���� ������ ���� ��û
        System.out.println(rt.totalMemory() + ":" + rt.freeMemory());

        alloc(20000000);
        // �ý����� �ƹ��ϵ� ���� ���� �� ������ ����
        try { Thread.sleep(20000); }
        catch( InterruptedException ex ) {}
        System.out.println(rt.totalMemory() + ":" + rt.freeMemory());
    }
    static void alloc( int size )
    {   System.out.println((new byte[size])[0]);
    }
}
