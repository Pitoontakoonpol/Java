class TypeConversionTest 
{
    public static void main (String[] args) 
	{
        int i = 1;

        System.out.println(i);

        long j = 2;
        j = i;       
        f(100);
        j = 4572681111L;
        System.out.println(j);
        // i = 111111111111; 

        i =(int) j;
        System.out.println(i);

        g((int)j);         
        i = (int) j;  
        g((int) j);  
    }
    static void f(long i) 
	{
		System.out.println(i);
		System.out.println(i+1);
    }
    static void g(int i) 
	{
		System.out.println(i);
    }
}