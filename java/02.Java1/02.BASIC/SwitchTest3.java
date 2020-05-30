class SwitchTest3 {
    public static void main(String[] args) {
        f(5); f(6); f(7); f(8);
    }

    static void f(int i) {
        switch( i % 5 ) {
        case 0: case 1:
            System.out.println( "5의 배수 혹은 + 1" );
            break;
        case 2:
            System.out.println( "5의 배수 + 2" );
        default:
            System.out.println( "default" );
        }
    }
}