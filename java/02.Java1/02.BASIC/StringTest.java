class StringTest {
    public static void main (String[] args) {
        String str = "abc" + "def";       // "abcdef"
        System.out.println( str.length() );     // 6
        System.out.println( "abc" + 1 + 2 + 3); // "abc123"
        System.out.println( "f = " + 3.14);     // "f = 3.14"
        System.out.println( "b = " + true);     // "b = true"
        str += 123;
        System.out.println(str);          // abcdef123
        MyInt3 i = null;
        System.out.println( "i = " + i);  // "i = null"
        i = new MyInt3(); i.val = 99;
        System.out.println( "i = " + i);  // "i = MyInt3(99)" 
    }
}

class MyInt3 {
    int val;
    public String toString()  { return "MyInt3(" + val + ")"; }
}
