public class CompilerTest {
    public static final void compile(ClassLoader classloader, String s, ClassFileData classfiledata, String s1, boolean flag, boolean flag1, String s2)
        throws JspException, IOException
    {
        File file = new File(s);
        file.getPath();
        String s3 = getPackageName(file);
        String s4 = getBaseClassName(file) + "_jsp_" + classfiledata.getNumber();
        String s5 = getJavaFileName(s4, s1);
        JspReader jspreader = JspReader.createJspReader(s);
        ServletWriter servletwriter = new ServletWriter(new PrintWriter(new EscapeUnicodeWriter(new FileOutputStream(s5))));
        Jsp1_0ParseEventListener jsp1_0parseeventlistener = new Jsp1_0ParseEventListener(classloader, jspreader, servletwriter, s, s4, s3, flag1, s2);
        Parser parser = new Parser(jspreader, jsp1_0parseeventlistener);
        jsp1_0parseeventlistener.beginPageProcessing();
        parser.parse();
        jsp1_0parseeventlistener.endPageProcessing();
        servletwriter.close();

        sun.tools.javac.Main javaCompiler = new sun.tools.javac.Main(System.err, "javac");
        String s6 = System.getProperty("path.separator");
        String as[] = {
            s5, "-classpath", System.getProperty("java.class.path") + s6 + System.getProperty("jsp.class.path", ".") + s6 + s1, "-d", s1
        };
        boolean flag2 = javaCompiler.compile(as);
        if(!flag)
        {
            File file1 = new File(s5);
            file1.delete();
        }
        if(!flag2)
            throw new JspException("Compilation failed");
        String s7 = s1 + File.separatorChar;
        if(s3 != null && !s3.equals(""))
            s7 = s7 + s3.replace('.', File.separatorChar) + File.separatorChar;
        s7 = s7 + s4 + ".class";
        File file2 = new File(s7);
        File file3 = new File(classfiledata.getClassFileName());
        if(file3.exists())
            file3.delete();
        if(!file2.renameTo(file3))
            throw new JspException("Unable to rename class file " + file2 + " to " + file3);
        else
            return;
    }

    public static void usage()
    {
        System.out.println("Usage: java com.sun.jsp.compiler.Main [-o outputDir] [-keepgenerated] <.jsp files>");
        System.exit(0);
    }
}
