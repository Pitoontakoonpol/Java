class MultiplyMatrix 
{
	public static void main(String[] args) 
	{
		int x;
		int y;
		for( y = 1; y <= 9; y++)
		{
			for (x = 1; x <= 9; x++)
			{
				System.out.print(x*y + "  ");
			}
			System.out.println();
		}
	}
}
