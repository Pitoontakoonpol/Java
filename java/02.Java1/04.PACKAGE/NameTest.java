class NameTest
{
    public static void main(String[] args)
    {
        int i = 0;
        {
//            int i = 3;
            System.out.println(i);
            System.out.println( aName() );
            System.out.println( aName );
        }
    }

    static int aName()
    {
        return 10;
    }

    static int aName = 100;
}
