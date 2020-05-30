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
        m();         // ���������� �����ǵ� �޽�� B�� m()�� ȣ���
        super.m();   // ����Ŭ������ �޽�� A�� m()�� ȣ���
    }
}

class SuperTest {
    public static void main(String[] args) {
        B b = new B();
        b.test();    // B.m()
                     // A.m()
    }
}
