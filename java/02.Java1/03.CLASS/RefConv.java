interface I1 {
    void mi1();
}

interface I2 {
    void mi2();
}

interface I3 extends I1, I2 {
    void mi3();
}

class C1 {
    public void mc1() {
    }
}

class C2 extends C1 implements I3 {
    public void mi1() {
    }
    public void mi2() {
    }
    public void mi3() {
    }
}

class RefConv {
    public static void main(String[] args) {
        I1 i1 = new C2();
        I2 i2 = (I2) i1;
        i2 = (I3) i1;
        C1 c1 = (C1) i1;
        C2 c2 = (C2) i1;

        // i1.mi2();  // ������ ����.
        c2.mi3();     // ��ü �������� ��Ȯ�� �ڷ����� �˸� 
        c2.mc1();     //   �� ���� ����� ����� �� �ִ�.

        c1 = new C1();
        try {
            c2 = (C2) c1;  // ����� ���� �߻�
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

        System.out.println(i1 instanceof C2);
        System.out.println(c1 instanceof C2);

        C1[] carr1 = new C2[10];
        C2[] carr2 = (C2[]) carr1;
        System.out.println(carr1 instanceof C2[]);
    }
}
