class ForWhileTest {
    public static void main(String[] args) {
        int n = 10, sum = 0;

        for(int i = 1; i <= n; i++ )
		{
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
        for(int i = 1; i <= n; )
		{
			sum += i;
			i++;
		}
		System.out.println(sum);

		int i;
		sum = 0;
        for(i = 1; i <= n; i++ )
            sum += i;
		System.out.println(sum);

		i = 1;
		sum = 0;
        for( ; i <= n; )
		{
            sum += i;
			i++;
		}
		System.out.println(sum);

        i = 1;
		sum = 0;
        while(i <= n) {
            sum += i;
            i++;
        }
		System.out.println(sum);

		i = 1;
		sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= n);
		System.out.println(sum);
    }
}
