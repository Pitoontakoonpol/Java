class ClassTest
{
	public static void main(String[] args) 
	{
		
	}
}

class A
{
	public static void main(String[] args) 
	{
		
	}
}

class C
{
	public static void main(String[] args) 
	{
		
	}
}

class B
{
	public static void main(String[] args) 
	{
		 f('c');       
        byte i = 2;
        f(i);     
        short j = 2;
        f(j);         
        f(2);         
        f(2L);
        //f(2.0);        
        
    }
    static void f(char c) 
    {
        System.out.println("f(char)");
    }
    static void f(int i) 
    {
        System.out.println("f(int)");
    }
    static void f(long i) 
    {
        System.out.println("f(long)");
    }
}