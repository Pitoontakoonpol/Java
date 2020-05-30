class NoClone {   // 디폴트로 clone()이 금지됨
    int i = 1;

    public static void main(String[] args)
        throws CloneNotSupportedException {
        NoClone no1 = new NoClone();
        NoClone no2 = (NoClone) no1.clone();
    }
}

