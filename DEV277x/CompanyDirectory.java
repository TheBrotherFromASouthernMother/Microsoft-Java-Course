package DEV277x;


public class CompanyDirectory {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 65000.00);
        TechnicalEmployee richard = new TechnicalEmployee("Richard", 85000.00);
        System.out.println(employee.getName());
        System.out.println(richard.getBaseSalary());
        System.out.println(employee.employeeID);
        System.out.println(richard.employeeID);
        System.out.println(richard.getEmployeeStatus());
    }

}
