class FloatingPointTest
{    public static void main( String[] args )
    {
        // float f = 2.0;  // compile error
        float f = 2.0F;
        float g = 4.23f;
		float h = f + g;
		System.out.println(h);
		
		System.out.println( 1.2345678901234567890123456789 );
                                         // 1.2345678901234567
        System.out.println( 2e3 );       // 2000.0
        System.out.println( 0.1 + 1.6 ); // 1.7000000000000002
        System.out.println( 3.0 / 0.0 ); // Infinity
        System.out.println( 0.0 / 0.0 ); // NaN
    }
}
