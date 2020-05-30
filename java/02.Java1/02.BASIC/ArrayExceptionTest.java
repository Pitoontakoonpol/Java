class ArrayExceptionTest {
    public static void main( String[] args ) {
        int a[] = {1, 2};
        //System.out.println( a[-1] );  
        // throw ArrayIndexOutOfBoundsException
        //System.out.println( a[2] );   
        // throw ArrayIndexOutOfBoundsException
        a = null;
        a[0] = 3;  // throw NullPointerException
    }
}
