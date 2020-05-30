class Circle
{
	double radius;

	void setRadius(double r)
	{
		radius = r;
	}

	double getArea()
	{
		double area = 3.14 * radius * radius;
		return area;
	}

	void display()
	{	
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("My radius is : " + radius);
		System.out.println("My area is : " + getArea());
		System.out.println("++++++++++++++++++++++++++++++");
	}
}

class CircleTest2
{
	public static void main(String[] args) 
	{
		Circle c1 =  new Circle();
		c1.setRadius(1.5);
		c1.display();
		

		Circle c2 = new Circle();
		c2.setRadius(30.2);
		c2.display();
		

		Circle c3 = new Circle();
		c3.setRadius(27.17);
		c3.display();
		

		System.out.println("Area difference c1 vs c2 = " + (c1.getArea() - c2.getArea()));

		c1 = null;
		c2 = null;
		c3 = null;
	}
}