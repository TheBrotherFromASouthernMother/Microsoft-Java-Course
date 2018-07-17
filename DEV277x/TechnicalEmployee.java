package DEV277x;

public class TechnicalEmployee extends Employee {
    public int checkins = 0;
    public TechnicalEmployee(String fullName, double baseSalary) {
        super(fullName, baseSalary);
        this.baseSalary = 75000.00;
        checkins ++;
    }

    @Override
    public String getEmployeeStatus() {
        return "Employee: " + this.employeeID + ". " + this.employeeName + " has checked in " + this.checkins + " times";
    }
}
