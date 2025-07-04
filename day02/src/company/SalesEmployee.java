package company;

public class SalesEmployee extends Employee {
    // member variable
    // empNo, name, salary
    private String loc;
    private String bonus;
    private double salary;

    public SalesEmployee(String 이비서, double v, String 이보스){

    }
    public SalesEmployee(String name, double salary, String loc, double bonus){
        super(name, salary);
        this.loc = loc;
        this.salary = salary;
    }
    public SalesEmployee(String empNo, String name, double salary, String loc, String bonus) {
        super(empNo, name, salary);
        this.loc = loc;
        this.bonus = bonus;
    }

    public String getLoc() {
        return loc;
    }

    public String getBonus() {
        return bonus;
    }

    public double getsalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "empNo=" + super.getEmpNo() +
                // ", name=" + super.getName() +
                ", salary=" + super.getSalary() +
                ", loc='" + loc + '\'' +
                ", bonus='" + bonus +
                '}';
    }

    @Override
    public double getAnnualSalary() {
        // return super.getAnnualSalary() * 12 + bonus;
        return super.getAnnualSalary() + bonus;
    }
}
