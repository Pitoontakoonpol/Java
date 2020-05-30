class  BlockTest
{
	public static void main(String[] args) 
	{
		int i = 10;
		int j = 20;
		System.out.println(i);
		System.out.println(j);

		Car s = new Car();

		int i = 30;
		System.out.println(i);
		// System.out.println(j); // compile error
	}
}

class Car
{
	int speed;
	String color;

	void start()
	{
		System.out.println("Test");
	}

	static void m()
	{
		System.out.println("Static Method");
	}
};
