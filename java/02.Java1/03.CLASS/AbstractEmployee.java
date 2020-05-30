abstract class Employee {  // 추상 클래스
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    abstract public int paycheck();  // 추상 메쏘드
    public void display() {
        System.out.println(name);
    }
}

class Permanent extends Employee {
    private int salary = 0;
    public Permanent(String name, int salary) {
        super(name);
        this.salary = salary;
    }
    public int paycheck() {
        return salary;
    }
}

class Temporary extends Employee {
    private double hourlyRate;
    private int hours;
    public Temporary(String name, int hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public int paycheck() {
        return (int) (hours * hourlyRate);
    }
}

class Department
{
    private Employee[] employeeList = new Employee[10];
    private int numEmployee = 0;
    void addEmployee(Employee employee) {
        employeeList[numEmployee++] = employee;
    }

    public void display() {
        for(int i = 0; i < numEmployee; ++i) {
            employeeList[i].display();
            System.out.println(
                "Pay: " + employeeList[i].paycheck());
        }
    }
}

class AbstractEmployee
{
    public static void main(String[] args) {
        // Employee gosling = new Employee("Gosling");
            // 오류: 추상 클래스의 객체를 생성할 수 없다.
        Permanent hoff = new Permanent("Hoff", 1000);
        Temporary shaio = new Temporary("Shaio", 10);
        shaio.setHours(35);

        Department javaDept = new Department();
        // javaDept.addEmployee(gosling);
        javaDept.addEmployee(hoff);
        javaDept.addEmployee(shaio);

        javaDept.display();
    }
}
