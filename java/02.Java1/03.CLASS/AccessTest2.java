class A {
    public int pub;
    protected int prot;
    int pack;
    private int priv;
}

class B extends A {
    public void f() {
        System.out.println(pub);
        System.out.println(prot);   // ����Ŭ�����̹Ƿ�
        System.out.println(pack);   // ���� ��Ű���̹Ƿ�
        System.out.println(priv);   // ����
    }
}

class AccessTest2 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.pub);
        System.out.println(a.prot);  // ���� ��Ű���̹Ƿ�
        System.out.println(a.pack);  // ���� ��Ű���̹Ƿ�
        System.out.println(a.priv);  // ����
    }
}
