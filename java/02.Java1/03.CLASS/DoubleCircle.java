class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
        System.out.println(
            "Circle(double radius): radius = " + this.radius);
    }
}

class DoubleCircle {
    private Circle inner = new Circle(1); // �ʱ�ȭ ����
    private Circle outer;
    // �ʱ�ȭ ���
    {   outer = new Circle(2); 
    }          
    public DoubleCircle() {
        System.out.println("DoubleCircle()");
    }
    public static void main(String[] args) {
        new DoubleCircle();
    }
}
