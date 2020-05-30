import java.io.*;

class StdIOTest2
{   public static void main( String[] args ) throws IOException
    {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while(!(line = in.readLine()).equals("quit"))
		{
			System.out.println(line);
		}
		in.close();
    }
}
