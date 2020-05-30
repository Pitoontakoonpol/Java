class Nesting {  // �����ϴ� Ŭ����
    private int i = 1;
    private static int si = 2;

    static class Nested { // ���Ե� �ֻ��� Ŭ����
        int j = 3;
        private static int k = 4;

        void print() {
            // System.out.println(i);  // ����
            System.out.println(si);
            System.out.println(j);
        }
    }

    Nesting() {
        System.out.println(Nested.k);
    }
}

class NestedClassTest {   
    public static void main(String[] args) {   
        Nesting.Nested nested = new Nesting.Nested();
        System.out.println(nested.j);
    }
}
