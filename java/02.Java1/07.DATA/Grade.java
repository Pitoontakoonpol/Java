import java.io.*;

class Grade {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader( 
            new FileReader("Grade.dat"));
                        
        for (String line; (line = in.readLine()) !=null;)
            System.out.println(line);
    }
}
