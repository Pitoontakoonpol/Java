class A {
    public void m() {
        System.out.println("A.m()");
    }
}

class B extends A {
    public B() {
        System.out.println("B()");
    }
    public void m() {
        System.out.println("B.m()");
    }
}
    
class ClassTest {
    public static void main(String[] ars)
        throws ClassNotFoundException,
            IllegalAccessException,
            InstantiationException {
        A a = new B();
        Class c1 = a.getClass();
        System.out.println(c1.getName());
        c1.newInstance();

        Class c2 = Class.forName("B");
        ((A) c2.newInstance()).m();

        System.out.println("abc".getClass().getName());
    }
}
