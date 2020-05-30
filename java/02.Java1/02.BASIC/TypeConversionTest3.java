class TypeConversionTest3 
{
	public static void main(String[] args) 
	{
		int d = 4, b =5, c;
		double x = 1.5, y;
		y = b/x;//value returned by b is cast to double
				//value of y is approximately 3.33333
		System.out.println(y);
		
		c = b/d;//all values are ints so the division
				//truncates: the value of c is 1!
		System.out.println(c);
		y = b/d;
		System.out.println(y);
		y = 1.0 * b / d;
		System.out.println(y);
		y = b / d * 1.0;
		System.out.println(y);
		y = (double) b / d;
		System.out.println(y);
	}
}
