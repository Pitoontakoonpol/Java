public class IC {
    static int nextSerial = 0;
    final int serialNo = nextSerial++; // instance constant
    public static void main(String[] args) {
        IC c1 = new IC();
        IC c2 = new IC();
        System.out.println("c1.serialNo = " + c1.serialNo);
        System.out.println("c2.serialNo = " + c2.serialNo);
        // c1.serialNo = 3;  // Error: constant
    }
}
