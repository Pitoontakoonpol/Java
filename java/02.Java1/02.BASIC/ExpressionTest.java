class ExpressionTest
{   public static void main( String args[] ) 
    {
        int i;
        i = 3;        // 치환
        i += 3 * 2;   // 치환
        ++i;          // 전치 증가
        --i;          // 전치 감소
        i++;          // 후치 증가
        i--;          // 후치 감소
        f(3);         // 메쏘드 호출
        new String( "This string" );  // 객체 생성
        i == 3;       // 컴파일러 오류
    }
    
    static int f( int input )
    {
        System.out.println( input );
        return input+1;
    }
}
