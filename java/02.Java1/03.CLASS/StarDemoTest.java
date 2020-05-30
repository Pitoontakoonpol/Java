class StarDemo
{
	public static void main(String[] args) 
	{
		int j;
		int k;
		int i;

		for (i = 1; i <= 5; i++)
		{
			for (j = 4; j >= i; j--) 
			{
				System.out.print(" ");		
			}

			for (k = 1; k <= (2 * i - 1); k++) 
			{
				System.out.print("%");		
			}

			System.out.println("");
		}
	}
}