class DefClone implements Cloneable { // clone() ���
    int i = 1;               
    int arr[] = {1, 2, 3};   // �迭 �������� �����

    public static void main(String[] args)
        throws CloneNotSupportedException {
        DefClone obj1 = new DefClone();
        DefClone obj2 = (DefClone) obj1.clone();
        obj1.i = obj1.arr[0] = 2;
        System.out.println("obj1.i = " + obj1.i
                           + ", obj2.i = " + obj2.i);
        System.out.println("obj1.arr[0] = " + obj1.arr[0]
                           + ", obj2.arr[0] = " + obj2.arr[0]);
    }
}
