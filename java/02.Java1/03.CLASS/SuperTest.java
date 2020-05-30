class A {
    public void m() {
        System.out.println("A.m()");
    }
}

class B extends A {
    public void m() {
        System.out.println("B.m()");
    }

    public void test() {
        m();         // 마지막으로 재정의된 메쏘드 B의 m()이 호출됨
        super.m();   // 상위클래스의 메쏘드 A의 m()이 호출됨
    }
}

class SuperTest {
    public static void main(String[] args) {
        B b = new B();
        b.test();    // B.m()
                     // A.m()
    }
}
