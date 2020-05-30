class CusClone implements Cloneable { // 커스터마이된 clone() 정의
    int i = 1;
    int arr[] = { 1, 2, 3 };

    public Object clone() {  // 필요하다면 public으로 선언한다.
        try {
            CusClone obj = (CusClone) super.clone();
            obj.arr = (int[]) arr.clone();
            return obj;
        } catch(CloneNotSupportedException ex) {
            throw new InternalError(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        CusClone obj1 = new CusClone();
        CusClone obj2 = (CusClone) obj1.clone();
        obj1.i = obj1.arr[0] = 2;
        System.out.println("obj1.i = " + obj1.i
                            + ", obj2.i = " + obj2.i);
        System.out.println("obj1.arr[0] = " + obj1.arr[0]
                            + ", obj2.arr[0] = " + obj2.arr[0]);
    }
}
