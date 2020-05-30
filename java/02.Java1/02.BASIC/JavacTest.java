import java.io.*;

class JavacTest {
    public static void main( String[] args )
        throws IOException {
        print( "ÇÑ±Û" );
        DataInputStream in = new DataInputStream(System.in);
        String line = in.readLine();
        System.out.println( line );
    }

    void print( String s ) {
        System.out.println( s );
    }
}
