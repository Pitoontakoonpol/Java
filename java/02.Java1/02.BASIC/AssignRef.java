class MyInt {
    int val;
}

class AssignRef {
    public static void main (String[] args) {
        int i = 1; inc(i);                
        System.out.println(i);      // 1
        
        MyInt m = new MyInt(); 
        m.val = 1; inc(m);
        System.out.println(m.val);  // 2

        MyInt n = new MyInt();
        n = m; n.val = 3;
        System.out.println(m.val); // 3
    }
    static void inc(int x) {
        ++x;
    }
    static void inc(MyInt y) {
        ++y.val;
    }
}        
