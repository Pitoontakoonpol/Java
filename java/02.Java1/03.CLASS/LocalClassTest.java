interface Runnable {
    public void run();
}

class LocalClassTest {   
    String str;

    LocalClassTest(String str) {
        this.str = str;
    }

    Runnable getRunnable(final int i) {
        class Command implements Runnable {
            public void run() {
                System.out.println(str + ", " + i);
            }
        }

        return new Command();
    }

    public static void main(String[] args) {
        LocalClassTest obj = new LocalClassTest("an obj");
        Runnable run1 = obj.getRunnable(1);
        run1.run();
        Runnable run2 = obj.getRunnable(2);
        run2.run();
    }
}
