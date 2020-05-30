import java.io.*;
import java.util.*;

class Grade
{
    public static void main(String[] args)
        throws IOException
    {
        BufferedReader in = new BufferedReader( 
            new FileReader(args[0]) );
	  	        
        int total1 = 0, total2 = 0, total3 = 0;
        int stNum = 0;
	  	    
        for( String line; (line = in.readLine()) !=null; )
        {
            System.out.print( line );
            StringTokenizer st = new StringTokenizer( line );
            st.nextToken();
            int jumsu1 = Integer.parseInt( st.nextToken() );
            int jumsu2 = Integer.parseInt( st.nextToken() );
            int jumsu3 = Integer.parseInt( st.nextToken() );
            System.out.println( " | " + (jumsu1 + jumsu2 + jumsu3) / 3 );
            stNum++;
            total1 += jumsu1;
            total2 += jumsu2;
            total3 += jumsu3;
        }
        System.out.println( "----------------+" );
        System.out.println( "ЦђБе   " + total1 / stNum +
                            " " + total2 / stNum +
                            " " + total3 / stNum );
        in.close();
    }
}
