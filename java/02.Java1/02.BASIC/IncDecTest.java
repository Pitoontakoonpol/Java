class IncDecTest
{
	public static void main(String[] args)
	{
		int i = 10;
		int j = 10;
		int k = 10;
		int m = 10;
		int result;

		System.out.println(++i);
		//i = i + 1;
		//System.out.println(i);

		System.out.println(j++);
		//System.out.println(i);
		//i = i + 1;

		//System.out.println(i);

		result = ++k;
		System.out.println(result);

		result = m++;
		System.out.println(result);
	}
}
