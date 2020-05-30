class IfWhileTest4
{
	public static void main(String[] args)
	{
		// int i = 0;
		// int total = 5000;
		// while (i <= total)
		// {
		// 	total = total - i;
		// 	i++;

		int pocketMoney = 5000;
		int day = 0;

		while(pocketMoney > 0)
		{
			pocketMoney = pocketMoney - day;
			day++;
			
			if (day <= 100) 
			{

			System.out.println("pocketMoney - " + day + " = " + pocketMoney);	
			
			}
		}
	}
}

