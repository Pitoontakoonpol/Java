class WhileTest
{
	public static void main(String[] args)
	{
		int i = 1;
		int total = 0;
		while (i <= 100)
		{
			total = total + i;
			if(i != 100)
			{
				System.out.print(i++ + "+");
			}
			else
				System.out.print(i++);
		}

		System.out.println(" = " + total);
	}
}

