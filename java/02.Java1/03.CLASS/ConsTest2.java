class A {
    static int print(String msg) {
        System.out.println(msg);
        return 0;
    }
    int i = print("A�� �ʵ� �ʱ�ȭ");
    public A() {
        print("������ A()�� ��ü ����");
    }
}

class B extends A {
    public int j = print("B�� �ʵ� �ʱ�ȭ");
    public B() {
        print("������ A()�� ��ü ����");
    }
}

class ConsTest2 {
    public static void main(String[] args) {
        B obj = new B();
    }
}
