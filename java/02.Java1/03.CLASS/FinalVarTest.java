class FinalVarTest {
    static final double PI = 3.1416;   // 화이널 클래스 변수

    static int count = 0;
    final int id;    // 비초기화 화이널 인스턴스 변수

    FinalVarTest() {
        id = count++;  // 비초기화 화이널 변수는 한번은 대입할 수 있다.
    }

    public static void main(String[] args) {
        System.out.println("FinalVarTest.PI = " + FinalVarTest.PI);
        // FinalVarTest.PI = 3;  // 오류: 화이널 변수의 내용을 수정할 수 없다.

        FinalVarTest obj1 = new FinalVarTest();
        FinalVarTest obj2 = new FinalVarTest();
        System.out.println("obj1.id = " + obj1.id);
        System.out.println("obj2.id = " + obj2.id);
        // obj1.id = 1;  // 오류: 화이널 변수의 내용을 수정할 수 없다.
        
        final int local;   // 비초기화 화이널 지역 변수
        local = 3;  // 비초기화 화이널 변수는 한번은 대입할 수 있다.
        // local = 4;  // 오류: 화이널 변수의 내용을 수정할 수 없다.
        
        m(4);
    }

    static void m(final int param) { // 화이널 매개 변수
        System.out.println("m(int): param = " + param); 
        // param = 3;  // 오류: final 변수의 내용을 수정할 수 없다.
    }
}
