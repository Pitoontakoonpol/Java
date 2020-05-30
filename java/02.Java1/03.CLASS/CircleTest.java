class Circle 
{
    private double radius = 0;

    public void setRadius(double r) 
    {
        radius = r;
    }

    public double getArea() 
    {
        return Math.PI * radius * radius;
    }

    public void display() 
    {
        System.out.println(
            "Areas of circle with radius " +
            radius + " = " + getArea());
    }
}

class CircleTest1
{
    public static void main(String[] args) 
    {
        Circle circle1 = new Circle(), circle2 = new Circle();
        circle1.setRadius(2);
        circle2.setRadius(3);
        circle1.display();
        circle2.display();
        double sumAreas = circle1.getArea() + circle2.getArea();
        System.out.println("Sum of areas of circle1 and circle2 = "
                            + sumAreas);
    }
}
