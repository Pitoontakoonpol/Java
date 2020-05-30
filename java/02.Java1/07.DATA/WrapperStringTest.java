class WrapperStringTest {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < args.length; ++i) 
            sum += Integer.parseInt(args[i]);  // sum of arguments
        System.out.println("Sum = " + sum);
        System.out.println(new Boolean("true").booleanValue());
            // true
        System.out.println(new Boolean("xyz").booleanValue());
            // false
        System.out.println(new Integer("12").intValue());
            // 12
        System.out.println(new Double("12.3").doubleValue());
            // 12.3
        System.out.println(new Double("12e3").doubleValue());
            // 12000.0 
        System.out.println(Integer.parseInt("101", 2));  // 5
        System.out.println(Integer.toString(5, 2));      // 101
        System.out.println(Integer.parseInt(" 12"));
            // NumberFormatException
        System.out.println(Integer.parseInt("12 "));
            // NumberFormatException
    }
}
