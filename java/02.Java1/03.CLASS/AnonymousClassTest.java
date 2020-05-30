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
        };  // return 문을 끝내기위해서 `;'가 필요
    }

    // 변수 초기화 수식에서의 익명 클래스
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
