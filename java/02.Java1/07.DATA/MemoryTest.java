public class MemoryTest
{
    public static void main( String[] args )
    {   Runtime rt = Runtime.getRuntime();
        System.out.println(rt.totalMemory() + ":" + rt.freeMemory());

        alloc(10000000);
        System.out.println(rt.totalMemory() + ":" + rt.freeMemory());

        alloc(20000000);  // 현재 할당된 메모리 초과로 인한 쓰레기 수집
        System.out.println(rt.totalMemory() + ":" + rt.freeMemory());
        System.gc();      // 프로그램에 의한 쓰레기 수집 요청
        System.out.println(rt.totalMemory() + ":" + rt.freeMemory());

        alloc(20000000);
        // 시스템이 아무일도 하지 않을 때 쓰레기 수집
        try { Thread.sleep(20000); }
        catch( InterruptedException ex ) {}
        System.out.println(rt.totalMemory() + ":" + rt.freeMemory());
    }
    static void alloc( int size )
    {   System.out.println((new byte[size])[0]);
    }
}
