class WhileLoopTest1
{
	public static void main(String[] args) 
	{
		
		int noCol = 45;
		int noRow = 20;
		int i = 1;
		int j = 1;

		do 
		{
			do
			{
				System.out.print("");
				i++;	
			}
			while(i <= noCol);

			System.out.println();
			j++;
			i = 1;
			System.out.print("*");
			i = i + 5;
			
		}
		while(j <= noRow);
	} 
}