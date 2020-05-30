class A {
    public void m(int i) {
        System.out.println("A.m(int)");
    }
    public void m(double f) {
        System.out.println("A.m(double)");
    }
}

class B extends A {
    public void m(int i) {
        System.out.println("B.m(int)");
    }
    public void m() {
        System.out.println("B.m()");
    }
}

class Override {
    public static void main(String[] args) {
        A a = new A();
        a.m(1);      // A의 m(int)가 호출됨

        B b = new B();
        b.m(1);      // B의 m(int)가 호출됨

        a = b;       // 상위 자료형 A인 변수 a를 통하여 접근하여도,
        a.m(1);      // 막지막으로 재정의된 메쏘드 B의 m(int)가 호출됨
        // a.m();    // 오류: 자료형 A에는 메쏘드 m()이 정의되어 있지 않음.

        b.m(1.0);    // B에서 정의된 m(int)와 상속된 m(double)이 
                     //   중복정의되고, m(double)이 호출됨
    }
}
