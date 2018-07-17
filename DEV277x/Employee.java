package DEV277x;

public class Employee {
    public static int employeeCount = 0;
    public String employeeName;
    public double baseSalary;
    public int employeeID;
    private String status;
    public Employee(String fullName, double baseSalary) {
        this.employeeName = fullName;
        this.baseSalary = baseSalary;
        employeeCount ++;
        employeeID = employeeCount;
        this.status = "hired";
    }

    public Employee() {
        this.employeeName = "Bob";
        this.baseSalary = 20000.00;
        employeeID ++;
        this.status = "contract to hire";
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public String getName() {
        return this.employeeName;
    }

    public boolean equals(Employee employee) {
        if (employee.employeeID == this.employeeID) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Employee: " + this.employeeID + " " + this.employeeName;
    }

    public String getEmployeeStatus() {
        return this.status;
    }

}
