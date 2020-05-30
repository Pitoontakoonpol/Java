class CloneTest
{   
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] array2 = array;
        int[] array3 = (int[]) array.clone();
        ++array[0];
        System.out.println(array[0] + ", " + array2[0] + ", " + array3[0]);
    }
}
