public class Outer {  // �ܺ� Ŭ����
    int i = 1;
    static int si = 2;

    public class Inner {   // ���� Ŭ����
        int j = 3;
        // static int k;   // ����

        void print() {
            System.out.println(i);   // �Ʒ��� ����
            System.out.println(Outer.this.i);
            System.out.println(si);
            System.out.println(j);
        }
    }

    Outer() {
        Inner inner1 = new Inner();  // �Ʒ��� ����
        Inner inner2 = Outer.this.new Inner();
        // System.out.println(inner1.j);
    }
}

class InnerClassTest {
    public static void main(String[] args) {   
        Outer outer = new Outer();
        System.out.println(outer.i);
        // System.out.println(outer.j); // ����

        Outer.Inner inner = outer. new Inner();
        // Outer.Inner inner2 = new Outer.Inner(); // ����
        // System.out.println(inner.i);
        // System.out.println(inner.si);
        System.out.println(inner.j); 
    }
}
