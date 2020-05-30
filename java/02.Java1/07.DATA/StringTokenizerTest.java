import java.util.StringTokenizer;

class StringTokenizerTest {
    public static void main(String[] args) {
        StringTokenizer st
            = new StringTokenizer("This \t is a \n String");
        while (st.hasMoreTokens()) 
            System.out.println(st.nextToken());
        // This
        // is
        // a
        // String
        StringTokenizer st2
            = new StringTokenizer("80::95:70:", ":");
        System.out.println("Average: " +
            (Integer.parseInt(st2.nextToken()) +
             Integer.parseInt(st2.nextToken()) +
             Integer.parseInt(st2.nextToken())) / 3.0);
        // Average: 81.66666666666667
    }
}
