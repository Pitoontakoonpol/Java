interface I1 {
    void m1();
}

interface I2 {
    void m2();
}

interface I3 extends I1, I2 {
    void m3();
}

interface I4 {
    void m4();
}

class C implements I3, I4 {
    public void a() { System.out.println("m1()"); }
    public void b() { System.out.println("m2()"); }
    public void c() { System.out.println("m3()"); }
    public void d() { System.out.println("m4()"); }
    public static void main(String[] args) {
        C c = new C();
        I3 i3 = c;
        I4 i4 = c;
        I1 i1 = c;
        I2 i2 = i3;
        i3.m1(); i3.m2(); i3.m3();
        i3.m4();  // ¿À·ù
    }
}
