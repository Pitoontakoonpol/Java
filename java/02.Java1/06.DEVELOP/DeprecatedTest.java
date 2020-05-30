import kr.ac.kaist.EasyVector;

class DeprecatedTest {
    public static void main(String[] args) {
        EasyVector v1 = new EasyVector();
        v1.addInt(3);
        System.out.println(v1.getInt(0));
        int i3 = v1.get(0);
    }
}
