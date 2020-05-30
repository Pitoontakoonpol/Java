import java.lang.reflect.*;

public class ReflectTest {
    public static void main(String[] args)
        throws ClassNotFoundException {
        Class c = Class.forName(args[0]);
        System.out.println(c);
        Method m[] = c.getMethods();
        for (int i = 0; i < m.length; i++)
            System.out.println(m[i].toString());

        Field f[] = c.getFields();
        for (int i = 0; i < f.length; i++)
            System.out.println(f[i].toString());
    }
}
