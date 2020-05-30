class StandardIOTest {
    public static void main(String[] args) {
        int ch, count = 0;
        try {
            for(count = 0; (ch = System.in.read()) != -1;) {
                ++count;
                System.out.write(ch);
            }
        }
        catch (java.io.IOException ex) {
            System.err.println("I/O Error: " + ex.getMessage());
        }
        System.err.println("\n" + count + " bytes copied.");
    }
}
