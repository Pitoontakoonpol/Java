class ExpressionTest
{   public static void main( String args[] ) 
    {
        int i;
        i = 3;        // ġȯ
        i += 3 * 2;   // ġȯ
        ++i;          // ��ġ ����
        --i;          // ��ġ ����
        i++;          // ��ġ ����
        i--;          // ��ġ ����
        f(3);         // �޽�� ȣ��
        new String( "This string" );  // ��ü ����
        i == 3;       // �����Ϸ� ����
    }
    
    static int f( int input )
    {
        System.out.println( input );
        return input+1;
    }
}
