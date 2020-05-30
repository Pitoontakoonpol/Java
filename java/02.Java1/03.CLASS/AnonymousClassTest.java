interface Runnable {
    public void run();
}

class AnonymousClassTest {   
    String str;
    AnonymousClassTest(String str) {
        this.str = str;
    }

    Runnable getRunnable(final int i) {
        return new Runnable() {
            public void run() {
                System.out.println( str + ", " + i );
            }
        };  // return ���� ���������ؼ� `;'�� �ʿ�
    }

    // ���� �ʱ�ȭ ���Ŀ����� �͸� Ŭ����
    Runnable runner = new Runnable() {
        public void run() {
            System.out.println( str );
        }
    };

    public static void main(String[] args) {
        AnonymousClassTest obj = new AnonymousClassTest( "an obj" );
        Runnable run1 = obj.getRunnable(1);
        run1.run();
        Runnable run2 = obj.getRunnable(2);
        run2.run();
        obj.runner.run();
    }
}
