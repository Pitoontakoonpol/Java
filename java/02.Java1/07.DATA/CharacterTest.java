class CharacterTest {
    public static void main(String[] args) {
        System.out.println(Character.isLetter('a'));      // true
        System.out.println(Character.isLetter('░б'));     // true
        System.out.println(Character.isLetter('ес'));     // true
        System.out.println(Character.isLetter('кв'));     // true
        System.out.println(Character.isDigit('1'));       // true
        System.out.println(Character.isUpperCase('a'));   // false
        System.out.println(Character.isWhitespace('\t')); // true
        System.out.println(Character.isISOControl('\t')); // true
        System.out.println(Character.getType('г▄') == 
                           Character.CURRENCY_SYMBOL);    // true
        System.out.println(Character.toUpperCase('a'));   // A
        System.out.println(Character.toUpperCase('ес'));  // е┴
        System.out.println(Character.toUpperCase('+'));   // +
        System.out.println(Character.toLowerCase('A'));   // a
        System.out.println(Character.MIN_RADIX);          // 2
        System.out.println(Character.MAX_RADIX);          // 36
        System.out.println(Character.digit('1', 8));      // 1
        System.out.println(Character.digit('a', 36));     // 10
        System.out.println(Character.digit('Z', 36));     // 35
        System.out.println(Character.digit('a', 8));      // -1
        System.out.println(Character.forDigit(3, 8));     // 3
        System.out.println(Character.forDigit(11, 20));   // b
        System.out.println(Character.getNumericValue('еб'));  // 1
        System.out.println(Character.getNumericValue('ич'));  // 1
        System.out.println(Character.getNumericValue('йч'));  // 1
        System.out.println(Character.UnicodeBlock.of('░б')
                    == Character.UnicodeBlock.HANGUL_SYLLABLES); // true
    }
}
