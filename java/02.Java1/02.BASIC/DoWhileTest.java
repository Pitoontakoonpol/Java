class DoWhileTest
{
	public static void main(String[] args)
	{
		int i = 1;
		int total = 0;
		do
		{
			total = total + i;
			if(i != 100)
			{
				System.out.print(i++ + "+");
			}
			else
			{
				System.out.print(i++);
			}
		} while (i <= 100);

		System.out.println(" = " + total);
	}
}

