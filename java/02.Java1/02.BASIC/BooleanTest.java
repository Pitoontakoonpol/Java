class BooleanTest {
    public static void main (String[] args) 
    {
        int var1 = 7, var2 = 13, var3 = 0;
        boolean res = true;
        res = (var1 > var2) && (var3 == 0);
        res = !res;

        System.out.println(2*2-3/3);

        System.out.println(res);

        int i = 0;

        //System.out.println(100/i);
        //System.out.println( (i != 0) & ( 100/i > 2) );
        System.out.println( (i != 0) && ( 100/i > 10) );
        // false

        System.out.println(i);

        System.out.println( (i != 0) || ( 100/i <= 10) );
        // true
        System.out.println( ( i == 0) ?  100 : 100/i );
        // 100

        System.out.println( (1 == 1) ^ (i == 2) );  // true
        
        // throw ArithmeticException (divide by zero)
        System.out.println( (i == 0) | ( 100/i <= 10) );
        // throw ArithmeticException (divide by zero)
    }
}
