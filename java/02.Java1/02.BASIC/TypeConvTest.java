class TypeConvTest 
{
    public static void main (String[] args) 
	{
        int i = 1;
        long j = 2;
        j = i;       // 안전한 형변환
        f(i);        // 안전한 형변환
        i = j;       // 오류: 묵시적 형변환 불가능
        g(j);        // 오류: 묵시적 형변환 불가능
        i = (int) j; // 명시적 형변환을 통해서 해결
        g((int) j);  // 명시적 형변환을 통해서 해결
    }
    static void f(long i) 
	{
		System.out.println(i);
    }
    static void g(int i) 
	{
		System.out.println(i);
    }
}
