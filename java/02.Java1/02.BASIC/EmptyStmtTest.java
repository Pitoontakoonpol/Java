class EmptyStmtTest {
    public static void main(String[] args) {
        int sum, i;

        sum = 0;
        for (i = 1; i <= 10; sum += i, i++)
            ;   // 빈문장
        System.out.println(sum);  // 55
        
        sum = 0;
        for (i = 1; i <= 10; sum += i, i++)
            {}  // 빈문장
        System.out.println(sum);  // 55
        
        sum = 0;
        for (i = 1; i <= 10; i++);  // <- 잘못된 빈문장 조심.
            sum += i;  // 빈문장으로 인해 for문의 부문장이 아님.
        System.out.println(sum);  // 11
    }
}
