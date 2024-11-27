import gestionMagasin.Store;
import product.FoodProduct;
import java.util.Date;


import employees.*;



public class Main {
    public static void main(String[] args) {

        Store store1 = new Store(1, "Carrefour", "City Center");
        Store store2 = new Store(2, "Monoprix", "Menzah 5");
  

        Store carrefour = new Store(1, "Carrefour", "City Center", 100);
        Store monoprix = new Store(2, "Monoprix", "Menzah 6", 100);

        store1.addEmployee(new Cashier(1, "Soulayma", "Béja", 190, 5));
        store1.addEmployee(new Cashier(2, "mohamed", "Ariana", 175, 6));
        store1.addEmployee(new SalesPerson(3, "Ali", "Marsa", 160, 1.2));
       store1.addEmployee(new Manager(4, "Imen", "Lac2", 170, 500));

        store2.addEmployee(new Cashier(5, "Dalila", "Sousse", 185, 3));
        store2.addEmployee(new SalesPerson(6, "Jalel", "Gafsa", 150, 1.1));
        store2.addEmployee(new SalesPerson(7, "Hadil", "Jerba", 180, 1.3));
        store2.addEmployee(new Manager(9, "Nesrin", "Sfax", 160, 700));
        store1.addProduct(new Product(1011, "Huile", "safey", 0.700));
        store1.addProduct(new Product(1012, "pate", "Warda", 500));
        store2.addProduct(new Product(2011, "eau", "Safeya", 1.200));
        store2.addProduct(new Product(2012, "yaghourt", "Natalait", 600));

        System.out.println("Carrefour Employees:");
        store1.displayDetails();
        System.out.println("\nMonoprix Employees:");
        store2.displayDetails();

       System.out.println("Salaries:");

       Stream.of(store1, store2)
    .flatMap(store -> store.getEmployees().stream())
    .forEach(employee -> 
        System.out.println(employee + ", Salary: " + employee.calculateSalary() + " DT")
    );
