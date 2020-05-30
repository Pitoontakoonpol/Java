class Outer {  // �����ϴ� Ŭ����
    int i = 1;
    static int si = 2;

    class Inner {  // ���� Ŭ����
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
        Inner inner2 = this.new Inner();
        System.out.println(inner1.j);
    }
}

class InnerClassTest {
    public static void main(String[] args) {   
        Outer outer = new Outer();
        System.out.println(outer.i);

        Outer.Inner inner = outer. new Inner();
        // Outer.Inner inner2 = new Outer.Inner(); // ����
        System.out.println(inner.j); 
    }
}
