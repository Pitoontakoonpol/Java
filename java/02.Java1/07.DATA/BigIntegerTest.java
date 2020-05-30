import java.math.BigInteger;

class BigIntegerTest {
    public static void main(String[] args) {   
        System.out.println(Long.MAX_VALUE);
        BigInteger i1 = new BigInteger("1000000000000000000000000");
        BigInteger i2 = BigInteger.valueOf(100000);
        BigInteger result = i1.multiply(i2).add(BigInteger.valueOf(3));
        System.out.println(result);
        System.out.println(result.bitCount());
    }
}
