class TypeConvTest 
{
    public static void main (String[] args) 
	{
        int i = 1;
        long j = 2;
        j = i;       // ������ ����ȯ
        f(i);        // ������ ����ȯ
        i = j;       // ����: ������ ����ȯ �Ұ���
        g(j);        // ����: ������ ����ȯ �Ұ���
        i = (int) j; // ����� ����ȯ�� ���ؼ� �ذ�
        g((int) j);  // ����� ����ȯ�� ���ؼ� �ذ�
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
