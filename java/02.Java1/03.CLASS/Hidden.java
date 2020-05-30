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

        // 변수와 클래스 메쏘드는 재정의되지 않고 은닉됨
        System.out.println(a.str);
        System.out.println(b.str);
        a.sm();
        b.sm();
        
        // 인스턴스 메쏘드를 통하여 재정의 효과를 얻을 수 있다.
        System.out.println(a.getStr());
    }
}
