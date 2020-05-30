class LabeledBreak {
    static int[][] matrix = {{2, 1}, {3, 5}, {8, 6}};

    public static void main(String[] args) 
    {
        boolean found = false;
    outer:
        for(int i = 0; i < matrix.length; ++i)
            for(int j = 0; j < matrix[i].length; ++j)
                if (matrix[i][j] == 3) {
                    found = true;
                    break outer;
                }
        if (found)
            System.out.println("3이 있음");
        else
            System.out.println("3이 없음");
    }
}
