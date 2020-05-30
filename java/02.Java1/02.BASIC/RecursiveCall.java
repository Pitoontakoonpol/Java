class RecursiveCall {
    public static void main(String[] args) 
    { 
        System.out.println( facRec(500000000) );
        System.out.println( facLoop(500000000) );
    }

    static int facRec( int n ) 
    {
        if ( n == 0 )
            return 1;
        else
            return facRec( n-1 ) * n;
    }

    static int facLoop( int n ) 
    {
        int result = 1;
        for( int i = 2; i <= n; i++ )
            result *= i;
        return result;
    }
}
