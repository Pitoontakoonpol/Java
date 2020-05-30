class A {
    int f;
    void m() {
    }
    static int sf;
    static void sm() {
    }
}

// A is a superclass (supertype) of class B
// B is a subclass (subtype) of class A
class B extends A {
    int f2;
    void m2() {
    }
}

class InheritTest {
    public static void m3(A a) {
        // only A's members can be accessed through variable `a'
    }

    public static void main() {
        B b = new B();
        b.f2++;   // B's field
        b.m2();   // B's method
        b.f++;    // field (inherited from A)
        b.m();    // method (inherited from A)
        B.sf++;   // static field (inherited from A)
        B.sm();   // static method (inherited from A)

        A a;      // expression of subtype B can appear 
        a = b;    //    where its expression of its 
        m3(b);    //    supertype A can appear.
        a.f2++;   // Error: no such member in static type A
        a.m2();   // Error: no such member in static type A
    }
}
