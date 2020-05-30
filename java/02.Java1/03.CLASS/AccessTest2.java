class A {
    public int pub;
    protected int prot;
    int pack;
    private int priv;
}

class B extends A {
    public void f() {
        System.out.println(pub);
        System.out.println(prot);   // 하위클래스이므로
        System.out.println(pack);   // 같은 패키지이므로
        System.out.println(priv);   // 오류
    }
}

class AccessTest2 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.pub);
        System.out.println(a.prot);  // 같은 패키지이므로
        System.out.println(a.pack);  // 같은 패키지이므로
        System.out.println(a.priv);  // 오류
    }
}
