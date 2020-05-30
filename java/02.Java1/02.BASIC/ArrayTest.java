class ArrayTest {
    public static void main( String[] args ) {
         int[]     a;     
         int       a2[];  
         a = new int[3];  
         a2 = new int[] {1, 2};  
         String[] as = { "array", "of", "string", };
         String[] as2 = { "another", "array", };
         

         System.out.println( as.length );    // 3
         for(int i = 0; i < as.length; ++i)
             System.out.println( as[i] );   // array
                                            // of
                                            // string
         as = as2;
         System.out.println( as.length ); // 2
         for(int i = 0; i < as.length; ++i)
             System.out.println( as[i] );   // another
                                            // array
         as2 = null;
    }
}
