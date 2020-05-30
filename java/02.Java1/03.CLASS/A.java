package sbs;

/*public*/ class A 
{
	protected /*private*/ A()
	{
		System.out.println("i'm a constructor");
	}

	protected A(int i)
	{
		this();
	}

	protected A(char c)
	{
		this();
	}

	public A(String str)
	{
		this();
	}

	void m()
	{
		new A();
		new A(1);
		new A('c');
		new A("abc");
	}

}

class B
{
	void m()
	{
		//new A(); //Error
		new A(1);
		new A('c');
		new A("abc");
	}

}

class E extends A
{
};