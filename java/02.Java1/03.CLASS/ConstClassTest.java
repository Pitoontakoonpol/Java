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
        // obj.v1 = 3;  // 오류: 화이널 변수이므로 접근 불가
        // obj.v2 = 4;  // 오류: private 변수이므로 접근 불가

        final NonConstClass obj2 = new NonConstClass();
        // obj2 = new NonConstClass(); // 오류: 화이널 변수이므로 수정 불가
        obj2.v = 3;   // 화이널 참조값을 통하여 객체의 내용 수정 가능
    }
}
