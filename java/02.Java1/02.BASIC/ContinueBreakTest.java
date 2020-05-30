class ContinueBreakTest
{
	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0;

		for( i = 1; i <= 100; i += 2)
		{
			if( i % 3 == 0 ) continue;
			sum += i;
			if( sum > 100)
			{
				sum -= i;
				System.out.println("Total = " + sum);
				break;
			}
			System.out.println(i);
		}
	}
}

