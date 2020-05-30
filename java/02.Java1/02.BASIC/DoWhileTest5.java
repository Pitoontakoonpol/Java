class DoWhileTest5
{
	public static void main(String[] args) 
	{
	
		int i = 1;
		int total = 0;

		do
		 {
		 	total = total + i;
		 	// i++;
		 	if (i <= 10) 
		 	{

		 		System.out.print(i++ + " + ");
		 		
		 	}
		 	else
		 	{
		 		System.out.print(i++);
		 	}
		 }
		 while(i <= 10);
		 System.out.println("Totle = " + total);
	}
}