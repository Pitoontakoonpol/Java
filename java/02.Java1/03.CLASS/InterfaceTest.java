interface Colorable {
    int WHITE = 0, RED = 1, BLUE = 2, GREEN = 3, BLACK = 4;
        // constant: public static final
    void setColor(int color); // �߻� �޽��: public abstract
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
        // Colorable c2 = new Colorable();  // ����
        Colorable c = new Colored();        // �����ڷ���/�����ڷ���
        c.setColor(Colorable.GREEN);        // ���̳� ���� ����
        System.out.println(c.getColor());
    }
}
