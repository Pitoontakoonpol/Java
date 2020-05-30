class ExprStmt
{   public static void main( String args[] ) 
    {
        int i;
        //System.out.println(i);

        i = 3;        
        i += 3 * 2;   

        System.out.println(i);

        ++i;          
        --i;          
        i++;          
        i--;          
        int res = f(3);

        System.out.println(res);

        new String( "This string" );  
        //i == 3;       
    }
    
    static int f( int input )
    {
        System.out.println( input );
        return input+1;
    }
}
