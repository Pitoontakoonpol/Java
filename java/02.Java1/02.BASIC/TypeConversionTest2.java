class TypeConversionTest2
{
	public static void main(String[] args) 
	{
		double a;
		a = 10;
		int n = 2;
		float x = 5.1F;
		double y = 1.33;
		a = (n * x)/y;
		n = (int)x;//legal in java
	    System.out.println(n); 

	}
}
