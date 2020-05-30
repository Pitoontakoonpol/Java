class LoopInLoop
{
 

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		a:
		for(int i I= 1; i  <= 10; i++ )
		{
		    System.out.println();
		    System.out.println("i = " + i);
		    for(int j = 1; j <= 10; j++ )
			{
				  if(( i == 2)&&(j == 3))break a;	
			      System.out.println("j = " + j );
				  		
			}
		}
	}
}

