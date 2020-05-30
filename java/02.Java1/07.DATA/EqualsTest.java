class NE { // `extends Object'�� �ڵ� ���Ե�
    int v;
    NE(int value) {
        v = value;
    }
}

class E { // `extends Object'�� �ڵ� ���Ե�
    int v;
    E(int value) {
        v = value;
    }
    public boolean equals(Object obj) {
        return (obj != null) && (v == ((E) obj).v);
    }
}

class EqualsTest { // `extends Object'�� �ڵ� ���Ե�
    public static void main(String[] args) {
        NE ne1 = new NE(1), ne2 = new NE(1);
        System.out.println(ne1 == ne2);      // ������ ��
        System.out.println(ne1.equals(ne2)); // ������ ��

        E e1 = new E(1), e2 = new E(1);
        System.out.println(e1 == e2);        // ������ ��
        System.out.println(e1.equals(e2));   // ���� ��

        String s1 = "abc", s2 = "ab", s3 = "c", s4 = s2 + s3;
        System.out.println(s1 == s4);        // ������ ��
        System.out.println(s1.equals(s4));   // ���� ��
    }
}
