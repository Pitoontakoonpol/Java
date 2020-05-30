class StaticInit 
{
    public static int facs[] = new int[10];  

    static 
    {       
        facs[0] = 1;
        for(int i = 1; i < 10; ++i)
            facs[i] = facs[i-1] * i;
        System.out.println("Inside of Static Block");
    }

    public static void main(String[] args) 
    {
        new StaticInit();
        new StaticInit();
	
	for(int i = 1; i < 10; ++i)
	{
	 System.out.println(StaticInit.facs[9]);
	}
    }
}
