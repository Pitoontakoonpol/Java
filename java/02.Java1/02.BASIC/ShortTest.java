class ShortTest 
{
	public static void main(String[] args) 
	{
		byte a = 1;
		byte b = 2;
		byte c;
		// c = a + b;  //compile error
		c = (byte)(a + b);
		System.out.println(c);

		short x = 2;
		short y = 3;
		short z;
		// z = x + y; //compile error : type casting
		z = (short)(x + y);
		System.out.println(z);
	}
}
