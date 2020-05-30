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
        a.m(1);      // A�� m(int)�� ȣ���

        B b = new B();
        b.m(1);      // B�� m(int)�� ȣ���

        a = b;       // ���� �ڷ��� A�� ���� a�� ���Ͽ� �����Ͽ���,
        a.m(1);      // ���������� �����ǵ� �޽�� B�� m(int)�� ȣ���
        // a.m();    // ����: �ڷ��� A���� �޽�� m()�� ���ǵǾ� ���� ����.

        b.m(1.0);    // B���� ���ǵ� m(int)�� ��ӵ� m(double)�� 
                     //   �ߺ����ǵǰ�, m(double)�� ȣ���
    }
}
