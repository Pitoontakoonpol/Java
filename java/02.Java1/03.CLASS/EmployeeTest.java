class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public int paycheck() {
        return 0;
    }
    public void printName() {
        System.out.print(name);
    }
}

class Department {
    private Employee[] employeeList = new Employee[10];
    private int numEmployee = 0;
    public void addEmployee(Employee employee) {
        employeeList[numEmployee++] = employee;
    }

    public void display() {
        for(int i = 0; i < numEmployee; i++) {
            employeeList[i].printName();
            System.out.println(
               ": $" + employeeList[i].paycheck());
        }
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

class Temporary extends Employee
{   private double hourlyRate;
    private int hours;
    public Temporary(String name, int hourlyRate)
    {   super(name);
        this.hourlyRate = hourlyRate;
    }
    public void setHours(int hours)
    {   this.hours = hours; }
    public int paycheck()
    {   return (int) (hours * hourlyRate); }
}

class SalesPerson extends Permanent {
    private int sales;
    private double commission;
    public SalesPerson (String name, 
                         int salary,
                         double commission) {
        super(name, salary);
        this.commission = commission;
    }
    public void setSales (int amount) {
        sales = amount;
    }
    public int paycheck () {
        return (int) (super.paycheck() + sales * commission);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Department javaDept = new Department();
        javaDept.addEmployee(new Employee("Gosling"));
        javaDept.addEmployee(new Permanent("Hoff", 1000));
        Temporary shaio = new Temporary("Shaio", 10);
        javaDept.addEmployee(shaio);
        SalesPerson starbuck
            = new SalesPerson("Starbuck", 200, 0.01);
        javaDept.addEmployee(starbuck);

        shaio.setHours(30);
        starbuck.setSales(50000);

        javaDept.display();
    }
}
