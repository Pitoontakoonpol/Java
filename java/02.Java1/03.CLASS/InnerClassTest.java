class Outer {  // 포함하는 클래스
    int i = 1;
    static int si = 2;

    class Inner {  // 내부 클래스
        int j = 3;
        // static int k;   // 오류

        void print() {
            System.out.println(i);   // 아래와 동일
            System.out.println(Outer.this.i);
            System.out.println(si);
            System.out.println(j);
        }
    }

    Outer() {
        Inner inner1 = new Inner();  // 아래와 동일
        Inner inner2 = this.new Inner();
        System.out.println(inner1.j);
    }
}

class InnerClassTest {
    public static void main(String[] args) {   
        Outer outer = new Outer();
        System.out.println(outer.i);

        Outer.Inner inner = outer. new Inner();
        // Outer.Inner inner2 = new Outer.Inner(); // 오류
        System.out.println(inner.j); 
    }
}
