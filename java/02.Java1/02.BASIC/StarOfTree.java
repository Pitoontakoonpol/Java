class  StarOfTree
{
	public static void main(String[] args) 
	{
			int maxNumOfStar = 100;
			int numOfIncrement = 2;
			int numOfCenter = maxNumOfStar / 2 + 1;
			int maxNumOfLine = maxNumOfStar / numOfIncrement + 1;
			for (int numOfLine = 1; numOfLine <= maxNumOfLine; numOfLine++)
			{
				//System.out.print(numOfLine + 1 + " : ");
				for (int numOfSpace = 1; numOfSpace <= 	numOfCenter - ((numOfLine  - 1)*(numOfIncrement / 2) + 1); numOfSpace++)
				{
					System.out.print(" ");
				}
				for (int numOfStar = 1 ; numOfStar <= (numOfLine  - 1) * numOfIncrement + 1; numOfStar++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}
}
