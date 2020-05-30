class Circle
{
	double radius;

	double getRadius()
	{
		return radius;
	}

	double getArea()
	{
		return Math.PI * radius * radius;
	}
}

class Rectangle
{
	double width;
	double height;

	double getWidth()
	{
		return width;
	}

	double getHeight()
	{
		return height;
	}

	double getArea()
	{
		return width * height;
	}
};

class  BasicTest
{
	public static void main(String[] args) 
	{
		Circle c = new Circle();
		c.radius = 20;
		System.out.println("Circle Radius = " + c.getRadius() 
			+ " Area : " + c.getArea());

		Rectangle r = new Rectangle();
		r.width = 4;
		r.height = 3;
		System.out.println("Rectangle Width = " + r.getWidth()
			+ " Height = " + r.getHeight()
			+ " Area = " + r.getArea());

		Circle c1 = new Circle();
		Circle c2 = new Circle();
		c1.radius = 5;
		c2.radius = 3;
		System.out.println("Difference circle(5) - circle(3) = "
			+ (c1.getArea() - c2.getArea()));

	}
}
