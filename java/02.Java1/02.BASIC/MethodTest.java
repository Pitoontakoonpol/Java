class MyInt2 {
    public int val;
    public void print() {
        System.out.println("My value is " + val);
    }
}

class MethodTest {
    public static void main (String[] args) {
        MyInt2 i = new MyInt2();
        i.val = 1;
        MyInt2 j = new MyInt2();
        j.val = 2;
        MyInt2 b = new MyInt2();
        b.val = 9;

        i.print();
        j.print();
        b.print();
    }
}        
