class MultiArrayTest {
    public static void main(String[] args) {
        int[][] aai = { {0, 1, 2}, {3, 4}, {5, 6, 7, 8} };
        System.out.println( aai.length );     // 3
        System.out.println( aai[0].length );  // 3
        System.out.println( aai[1].length );  // 2
        System.out.println( aai[2].length );  // 4

        for(int i = 0; i < aai.length; ++i)
            for(int j = 0; j < aai[i].length; ++j)
                System.out.println( aai[i][j] );

        int[][] matrix1 = new int[3][3];
        // matrix1 배열 선언은 다음과 같이 선언하고
        // 초기화시키는 것과 유사하다.
        int[][] matrix2 = new int[3][]; 
        for (int i = 0; i < matrix2.length; ++i) 
            matrix2[i] = new int[3];
    }
}
