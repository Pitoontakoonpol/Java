abstract class A {      // �߻� Ŭ����
    abstract void m();  // �߻� �޽��
}

abstract class B extends A { // �߻� Ŭ����
}

class C extends B {
    void m() {
        // ...
    }
}

abstract class A2 { // �߻� Ŭ����
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
        A a = new A();    // ����
        B b = new B();    // ����
        C c = new C();
        A2 d = new A2();  // ����
        B2 e = new B2();
    }
}
