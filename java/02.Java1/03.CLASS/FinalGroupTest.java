class Weekday {    // final 변수 그룹
    final static int SUNDAY = 0,
                     MONDAY = 1,
                     TUESDAY = 2,
                     WEDNESDAY = 3,
                     THURSDAY = 4,
                     FRIDAY = 5,
                     SATURDAY = 6;
}

class FinalGroupTest {
    public static void main(String[] args) {
        int wday;
        wday = Weekday.SUNDAY;
        System.out.println( wday );   // 0
        wday = Weekday.THURSDAY + 1;
        System.out.println( wday );   // 5
    }
}
