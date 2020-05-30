interface Colorable {
    int WHITE = 0, RED = 1, BLUE = 2, GREEN = 3, BLACK = 4;
        // constant: public static final
    void setColor(int color); // 추상 메쏘드: public abstract
    int getColor();
}

class Colored implements Colorable {
    private int color;
    public void setColor(int color) {
        this.color = color;
    }
    public int getColor() {
        return color;
    }
}

abstract class Colored2 implements Colorable {
    private int color;
    public void setColor(int color) {
        this.color = color;
    }
}

class InterfaceTest {
    public static void main(String[] args) {
        // Colorable c2 = new Colorable();  // 오류
        Colorable c = new Colored();        // 하위자료형/상위자료형
        c.setColor(Colorable.GREEN);        // 파이널 변수 접근
        System.out.println(c.getColor());
    }
}
