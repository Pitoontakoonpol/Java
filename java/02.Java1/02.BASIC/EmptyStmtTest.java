class EmptyStmtTest {
    public static void main(String[] args) {
        int sum, i;

        sum = 0;
        for (i = 1; i <= 10; sum += i, i++)
            ;   // ����
        System.out.println(sum);  // 55
        
        sum = 0;
        for (i = 1; i <= 10; sum += i, i++)
            {}  // ����
        System.out.println(sum);  // 55
        
        sum = 0;
        for (i = 1; i <= 10; i++);  // <- �߸��� ���� ����.
            sum += i;  // �������� ���� for���� �ι����� �ƴ�.
        System.out.println(sum);  // 11
    }
}
