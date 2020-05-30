class ConstClass {
    final int v1;
    private int v2;

    ConstClass(int value1, int value2) {
        v1 = value1;
        v2 = value2;
    }

    int getV2() {
        return v2;
    }
}

class NonConstClass {
    int v;
}

class ConstClassTest {
    public static void main(String[] args) {
        ConstClass obj = new ConstClass(1, 2);
        System.out.println("obj.v1 = " + obj.v1);
        System.out.println("obj.getV2() = " + obj.getV2());
        // obj.v1 = 3;  // ����: ȭ�̳� �����̹Ƿ� ���� �Ұ�
        // obj.v2 = 4;  // ����: private �����̹Ƿ� ���� �Ұ�

        final NonConstClass obj2 = new NonConstClass();
        // obj2 = new NonConstClass(); // ����: ȭ�̳� �����̹Ƿ� ���� �Ұ�
        obj2.v = 3;   // ȭ�̳� �������� ���Ͽ� ��ü�� ���� ���� ����
    }
}
