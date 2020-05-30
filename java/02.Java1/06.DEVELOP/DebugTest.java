class Debug {
    public static final boolean DEBUG = true;
}

class DebugTest {
    public static void main(String[] args) {
        if (Debug.DEBUG && !(args != null && args.length > 1)) {
            throw new RuntimeException("Debug Error: ");
        }
    }
}
