package employees;

 public abstract class Employee {
    private int id;
    private String name;
    private String address;
    private int hoursPerMonth;

    public Employee(int id, String name, String address, int hoursPerMonth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.hoursPerMonth = hoursPerMonth;
    }

    public int getHoursPerMonth() {
        return hoursPerMonth;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [ID: " + id + ", Name: " + name + ", Address: " + address + ", Hours: " + hoursPerMonth + "]";
    }
}