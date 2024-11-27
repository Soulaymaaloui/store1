package employees;


public class Salesperson extends Employee {
    private double salesRate;

    public Salesperson(int id, String name, String address, int hoursPerMonth, double salesRate) {
        super(id, name, address, hoursPerMonth);
        this.salesRate = salesRate;
    }

    @Override
    public double calculateSalary() {
        return 450 * salesRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sales Rate: " + salesRate;
    }
}