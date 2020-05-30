import java.awt.*;
import java.applet.*;
import java.io.*;

public class ASTest extends Applet
{   public void init()
    {   try 
        {   String[] args = {"input.txt", "output.txt"};
            main(args);
        } catch(IOException e)
        {   e.printStackTrace();
        }
        File f = new File("input.txt");
        System.out.println(f.getAbsolutePath());
    }
    public static void main( String[] args )
        throws IOException
    {   System.out.println("main started");
        InputStream in = new FileInputStream(args[0]);
        OutputStream out = new FileOutputStream(args[1]);
        int count = 0;
        for(int b; (b = in.read()) != -1;)
        {    ++count;
             out.write( b );
        }
        System.err.println(count + " bytes copied.");
        out.close();
    }
}
