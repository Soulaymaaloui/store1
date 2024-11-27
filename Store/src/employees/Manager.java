package employees;


public class Manager extends Employee {
    private double bonus;

    public Manager(int id, String name, String address, int hoursPerMonth, double bonus) {
        super(id, name, address, hoursPerMonth);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        int overtime = Math.max(0, getHoursPerMonth() - 160);
        double baseSalary = getHoursPerMonth() * 10;
        double overtimePay = overtime * 10 * 0.2;
        return baseSalary + overtimePay + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus: " + bonus;
    }
}