class NE { // `extends Object'가 자동 삽입됨
    int v;
    NE(int value) {
        v = value;
    }
}

class E { // `extends Object'가 자동 삽입됨
    int v;
    E(int value) {
        v = value;
    }
    public boolean equals(Object obj) {
        return (obj != null) && (v == ((E) obj).v);
    }
}

class EqualsTest { // `extends Object'가 자동 삽입됨
    public static void main(String[] args) {
        NE ne1 = new NE(1), ne2 = new NE(1);
        System.out.println(ne1 == ne2);      // 참조값 비교
        System.out.println(ne1.equals(ne2)); // 참조값 비교

        E e1 = new E(1), e2 = new E(1);
        System.out.println(e1 == e2);        // 참조값 비교
        System.out.println(e1.equals(e2));   // 내용 비교

        String s1 = "abc", s2 = "ab", s3 = "c", s4 = s2 + s3;
        System.out.println(s1 == s4);        // 참조값 비교
        System.out.println(s1.equals(s4));   // 내용 비교
    }
}
