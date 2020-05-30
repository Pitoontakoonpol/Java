class C {
    int f1;      
    double f2;   
}

class ClassTest {
    public static void main (String[] args) {
        C c1;          
        c1 = new C();  
        
        System.out.println(c1.f1);
        System.out.println(c1.f2);
        System.out.println("--------------");

        c1.f1 = 2;
        c1.f2 = 3.5;

        System.out.println(c1.f1);
        System.out.println(c1.f2);
        System.out.println("--------------");

        c1.f1 = 1;     
        c1.f2 = 3.14;

        System.out.println(c1.f1);
        System.out.println(c1.f2);
        System.out.println("--------------");

        C c2;
        c2 = c1;       
        c2 = null;     
    }
}        
