class StringTest {
    public static void main(String[] args) {
        System.out.println("abc".charAt(1));            // "b"
        System.out.println("abc".substring(0, 2));      // "ab"

        System.out.println("abc".toUpperCase());        // "ABC"
        System.out.println("abab".replace('a', 'c'));   // "cbcb"
        System.out.println(" \ta b ".trim());           // "a b"

        System.out.println("abc".compareTo("aabc") > 0); // true
        System.out.println(
            "abcdef".regionMatches(true, 1, "xyBcdz", 2, 3));
                                                        // true
        System.out.println("abcabc".indexOf('b'));      // 1
        System.out.println("abcabc".indexOf('b', 2));   // 4
        System.out.println("abcabc".indexOf('d'));      // -1
        System.out.println("abcabc".indexOf("bc"));     // 1
        System.out.println("abcabc".lastIndexOf('c', 5)); // 5
    }
}
