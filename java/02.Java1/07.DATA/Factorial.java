import java.math.BigInteger;

class Factorial {
    public static void main(String[] args) {   
        int n = Integer.parseInt(args[0]);
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}
