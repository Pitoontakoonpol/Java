class T {
    public int v;

    public T() {
    }

    public T(int val) {
        v = val;
    }
}

class PT {
    public T v;

    public PT() {
    }

    public PT(T val) {
        v = val;
    }
}

class PPT {
    public PT v;

    public PPT() {
    }

    public PPT(PT val) {
        v = val;
    }
}

class A {
    public static final int SIZE = 10;

    // C의 unsigned char가 char보다는 byte의 의미로 보다 많이 사용된다면,
    // 다음에서 byte[]로 선언하는 것이 더 적절하다.
    public char[] v = new char[SIZE];
}

class PA {
    public A v;

    public PA() {
    }

    public PA(A val) {
        v = val;
    }
}

class TypeDefTest {
    public static final int SIZE = 10;
    public static void main(String[] args) {
        T t1 = new T(), t2 = new T();
        PT pt = new PT(t1);
        PPT ppt = new PPT(pt);
        A a = new A();
        PA pa = new PA(a);

        t1.v = 1;
        t2.v = 2;
        System.out.println("t1.v = " + t1.v + ", t2.v = " + t2.v +
                           ", pt.v.v = " + pt.v.v + 
                           ", ppt.v.v.v = " + ppt.v.v.v );
        pt.v = t2;
        System.out.println("t1.v = " + t1.v + ", t2.v = " + t2.v +
                           ", pt.v.v = " + pt.v.v + 
                           ", ppt.v.v.v = " + ppt.v.v.v );
    
        a.v[0] = 'a';
        System.out.println("a.v[0] = " + a.v[0] +
                           ", pa.v.v[0] = " + pa.v.v[0] );
    }
}
