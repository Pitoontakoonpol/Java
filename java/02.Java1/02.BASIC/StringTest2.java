class StringTest2
{
	public static void main(String[] args) 
	{
		String str2 = "Hello";
		String str3 = "Hello";
		String str4 = new String("Hello");
		if (str2 == str3)
		{
			System.out.println("str2 == str3 is true!");
		}
		else
		{
			System.out.println("str2 == str3 is false!");
		}
		if (str2.equals(str3))
		{
			System.out.println("str2.equals(str3) is true!");
		}
		else
		{
			System.out.println("str2.equals(str3) is false!");
		}
		if (str4 == str3)
		{
			System.out.println("str4 == str3 is true!");
		}
		else
		{
			System.out.println("str4 == str3 is false!");
		}
		if (str4.equals(str3))
		{
			System.out.println("str4.equals(str3) is true!");
		}
		else
		{
			System.out.println("str4.equals(str3) is false!");
		}

	}
}

/* str2 == str3 is true!
str2.equals(str3) is true!
str4 == str3 is false!
str4.equals(str3) is true! */