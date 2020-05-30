class A {
    static int print(String msg) {
        System.out.println(msg);
        return 0;
    }
    int i = print("A의 필드 초기화");
    public A() {
        print("생성자 A()의 몸체 실행");
    }
}

class B extends A {
    public int j = print("B의 필드 초기화");
    public B() {
        print("생성자 A()의 몸체 실행");
    }
}

class ConsTest2 {
    public static void main(String[] args) {
        B obj = new B();
    }
}
