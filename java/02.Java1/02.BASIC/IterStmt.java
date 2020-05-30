class IterStmt {
    public static void main(String[] args) {
        int n = 10, sum = 0;

        for( int i = 1; i <= n; i++ )
            sum += i;

        int i;
        for( i = 1; i <= n; i++ )
            sum += i;

        i = 1;
        while(i <= n) {
            sum += i;
            i++;
        }

        i = 1;
        do {
            sum += i;
            i++;
        } while (i <= n);
    }
}
