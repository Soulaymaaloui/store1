package employees;


public class Cashier extends Employee {
    private int registerNumber;

    public Cashier(int id, String name, String address, int hoursPerMonth, int registerNumber) {
        super(id, name, address, hoursPerMonth);
        this.registerNumber = registerNumber;
    }

    @Override
    public double calculateSalary() {
        int overtime = Math.max(0, getHoursPerMonth() - 180);
        double baseSalary = getHoursPerMonth() * 5;
        double overtimePay = overtime * 5 * 0.15;
        return baseSalary + overtimePay;
    }

    @Override
    public String toString() {
        return super.toString() + ", Register: " + registerNumber;
    }
}