class A {
    public String str = "A.str";
    public static void sm() {
        System.out.println("A.sm()");
    }
    public String getStr() {
        return str;
    }
}

class B extends A {
    public String str = "B.str";
    public static void sm() {
        System.out.println("B.sm()");
    }
    public String getStr() {
        return str;
    }
}

class Hidden {
    public static void main(String[] args) {
        B b = new B();
        A a = b;

        // ������ Ŭ���� �޽��� �����ǵ��� �ʰ� ���е�
        System.out.println(a.str);
        System.out.println(b.str);
        a.sm();
        b.sm();
        
        // �ν��Ͻ� �޽�带 ���Ͽ� ������ ȿ���� ���� �� �ִ�.
        System.out.println(a.getStr());
    }
}
