class FinalVarTest {
    static final double PI = 3.1416;   // ȭ�̳� Ŭ���� ����

    static int count = 0;
    final int id;    // ���ʱ�ȭ ȭ�̳� �ν��Ͻ� ����

    FinalVarTest() {
        id = count++;  // ���ʱ�ȭ ȭ�̳� ������ �ѹ��� ������ �� �ִ�.
    }

    public static void main(String[] args) {
        System.out.println("FinalVarTest.PI = " + FinalVarTest.PI);
        // FinalVarTest.PI = 3;  // ����: ȭ�̳� ������ ������ ������ �� ����.

        FinalVarTest obj1 = new FinalVarTest();
        FinalVarTest obj2 = new FinalVarTest();
        System.out.println("obj1.id = " + obj1.id);
        System.out.println("obj2.id = " + obj2.id);
        // obj1.id = 1;  // ����: ȭ�̳� ������ ������ ������ �� ����.
        
        final int local;   // ���ʱ�ȭ ȭ�̳� ���� ����
        local = 3;  // ���ʱ�ȭ ȭ�̳� ������ �ѹ��� ������ �� �ִ�.
        // local = 4;  // ����: ȭ�̳� ������ ������ ������ �� ����.
        
        m(4);
    }

    static void m(final int param) { // ȭ�̳� �Ű� ����
        System.out.println("m(int): param = " + param); 
        // param = 3;  // ����: final ������ ������ ������ �� ����.
    }
}
