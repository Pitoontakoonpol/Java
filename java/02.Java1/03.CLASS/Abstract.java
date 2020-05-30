abstract class A {      // 추상 클래스
    abstract void m();  // 추상 메쏘드
}

abstract class B extends A { // 추상 클래스
}

class C extends B {
    void m() {
        // ...
    }
}

abstract class A2 { // 추상 클래스
    void m2() {
        // ...
    }
}

class B2 extends A2 {
    void m2() {
        super.m2();
        // ...
    }
}

class Abstract {
    public static void main(String[] args) {
        A a = new A();    // 오류
        B b = new B();    // 오류
        C c = new C();
        A2 d = new A2();  // 오류
        B2 e = new B2();
    }
}
