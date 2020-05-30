class NumberTest {
    public static void main (String[] args) {
        System.out.println(Integer.MIN_VALUE);   // -2147483648
        System.out.println(Integer.MAX_VALUE);   // 2147483647
        System.out.println(Long.MIN_VALUE);      // -9223372036854775808
        System.out.println(Long.MAX_VALUE);      // 9223372036854775807
        System.out.println(Double.MIN_VALUE);    // 4.9E-324
        System.out.println(Double.MAX_VALUE);
                                   // 1.7976931348623157E+308
        System.out.println(3.0/0);               // "Infinity"
        System.out.println(-3.0/0);              // "-Infinity"
        System.out.println(3.0/0 == -3.0/0);     // false
        System.out.println(Double.isInfinite(-3.0/0)); // true
        System.out.println(0.0/0);               // "NaN"
        System.out.println(3.0/0 + -1.0/0);      // "NaN"
        System.out.println(0.0/0 == 0.0/0);      // false
        System.out.println(0.0/0 != 0.0/0);      // true
        System.out.println(Double.isNaN(0.0/0)); // true
    }
}
