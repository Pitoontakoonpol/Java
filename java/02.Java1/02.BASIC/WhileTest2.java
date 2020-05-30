class WhileTest2
{
	public static void main(String[] args)
	{
		int i = 1;
		int total = 1;
		while (i <= 15)
		{
			total = total * i;
			i++;
		}

		System.out.println(" = " + total);
	}
}

