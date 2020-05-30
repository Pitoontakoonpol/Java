package cbs;

class C
{
	void m()
	{
		//new sbs.A(); 
		//new sbs.A(1);
		//new sbs.A('c');
		new sbs.A("abc");
	}
};

class D extends sbs.A 
{
	void m()
	{
		//new sbs.A();
		//new sbs.A(1);
		//new sbs.A('c');
		new sbs.A("abc");
	}
}

class ConstructorAccessTest
{
};