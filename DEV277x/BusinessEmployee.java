package DEV277x;

public class BusinessEmployee extends Employee {
    public boolean isAFatCat;
    public boolean isAWorkerDrone;
    public BusinessEmployee(String name) {
        super(name, 50000.0);

    }

    private boolean eligbleForBonus() {
        if (this.isAFatCat) {
            return true;
        } else {
            return false;
        }
    }

    public double getsBonus() {
        if (eligbleForBonus()) {
            return this.baseSalary * 0.10;
        } else {
            return 0;
        }
    }
}
