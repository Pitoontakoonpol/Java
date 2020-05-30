class Circle {
    private double radius = 0;
    public Circle setRadius(double radius) {
        this.radius = radius;
        return this;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public Circle display() {
        System.out.println(
            "Areas of circle with radius " +
            radius + " = " + getArea());
        return this;
    }
}

class ThisTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        (((circle1.setRadius(3)).display()).setRadius(5)).display();
        circle1.setRadius(3).display().setRadius(5).display();
    }
}
