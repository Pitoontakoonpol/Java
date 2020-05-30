class Nesting {  // 포함하는 클래스
    private int i = 1;
    private static int si = 2;

    static class Nested { // 포함된 최상위 클래스
        int j = 3;
        private static int k = 4;

        void print() {
            // System.out.println(i);  // 오류
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
