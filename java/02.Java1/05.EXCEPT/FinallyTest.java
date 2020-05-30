class FinallyTest {
    public static void main(String[] args)
        throws java.io.IOException {
        java.io.FileInputStream infile = null;
        try {
            infile = new java.io.FileInputStream(args[0]);
            int count = 0;
            for (int ch; (ch = infile.read()) != -1;)
                count++;
            System.out.println(
                args[0] + " ȭ���� ����Ʈ ��: " + count);
        } catch (java.io.FileNotFoundException ex) {
            System.err.println(args[0] + " ȭ���� �����ϴ�.");
        } finally {
            if (infile != null)
                infile.close();
            System.out.println("finally �κ� ����");
        }
    }
}
