class Circle 
{
    private double area = 0;

    public void setRadius(double r) 
    {
        area = Math.PI * r * r;
    }

    public double getArea() 
    {
        return area;
    }

    public void display() 
    {
        System.out.println(
            "Areas of circle with radius " +
            Math.sqrt(area / Math.PI) + " = " + getArea());
    }
}

class AccessTest 
{
    public static void main(String[] args) {
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
