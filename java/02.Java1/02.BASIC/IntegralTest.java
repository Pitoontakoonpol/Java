class IntegralTest
{    public static void main( String[] args )
    {   
		byte a = 1;
		byte b = 2;
		byte c;
		// c = a + b;  //compile error
		c = (byte)(a + b);
		System.out.println(c);

		short d = 2;
		short e = 3;
		short f;
		// f = d + e; //compile error : type casting
		f = (short)(d + e);
		System.out.println(f);

		int g = 2;
		int h = 3;
		int i;
		i = g + h; //no error
		System.out.println(i);

		long j = 2;
		long k = 3;
		long m;
		m = j + k; //no error
		System.out.println(m);

		System.out.println( 12 );         // 12
        System.out.println( 012 );        // 10 (Octenumber)
        System.out.println( 0xA3 );       // 163 (Hexa)
        System.out.println( 0x80000000 ); // -2147483648
        System.out.println( 5 % 3 );      // 2
        System.out.println( -5 % 3 );     // -2
        System.out.println( 0x80000001 << 2 );   // 4 = 0x00000004
        System.out.println( 0xFFFFFFFF  );       // -1
        System.out.println( 0xFFFFFFFF >> 30 );  // -1 = 0xFFFFFFFF
        System.out.println( 0xFFFFFFFF >>> 30 ); // 3

        char ch = 'a';
        System.out.println( ch );          // a
        System.out.println( (int) ch );    // 97
        System.out.println( '\141' );     // a
        System.out.println( '\u0061' );   // a
        System.out.println( ++ch );        // b

        int n = 0;
        System.out.println( 3 / n );      
    }
}
