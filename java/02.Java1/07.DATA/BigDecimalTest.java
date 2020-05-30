import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {   
        System.out.println(0.1 + 1.6);
        System.out.println(new BigDecimal(0.1));
        System.out.println(new BigDecimal(1.6));
        // 0.1과 0.6이 이미 표현 오차를 갖는다.
        System.out.println(new BigDecimal(0.1)
                            .add(new BigDecimal(1.6)));
        // 해결책 1
        System.out.println(new BigDecimal("0.1")
                            .add(new BigDecimal("1.6")));
        // 해결책 2
        System.out.println(BigDecimal.valueOf(1, 1)
                            .add(BigDecimal.valueOf(16, 1)));

        BigDecimal d1 = new BigDecimal(5);
        BigDecimal d2 = BigDecimal.valueOf(2);
        BigDecimal result = d1.multiply(d2)
            .divide(BigDecimal.valueOf(3), 30, BigDecimal.ROUND_HALF_UP);

        System.out.println(result);
        System.out.println(result.scale());
    }
}
