package gestionMagasin;


import java.util.ArrayList;
import java.util.List;

import employees.Employe;
import product.FoodProduct;


public class Store {
    private int id;
    private  String name;
    private String address;
    private int capacity;
    private List<FoodProduct> products;
    private List<Employe> listOfEmployees;












    public Store(int id, String name, String address, int capacity) {
        this.id = id;
        this.name = name;

        this.address = address;
        this.capacity = capacity;
        this.products = new ArrayList<>();
        this.listOfEmployees = new ArrayList<>();

    }


    public void addEmployee(Employe employee) {
        if (listOfEmployees.size() >= 20) {
            System.out.println("Employee limit reached.");
            return;
        }
        listOfEmployees.add(employee);
    }
    public void displayEmployeesDetails() {
        for (Employe i : listOfEmployees) {
            System.out.println(i + ", Salary: " + i.calculateSalary() + " DN :)");
        }
    }



    public Store(int id,String name, String address) {
        this.id = id;
        this.name = name;

        this.address = address;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<FoodProduct> getProducts() {
        return products;
    }


    public boolean addProduct(FoodProduct product) {

        if ( products.size() > capacity){
            System.out.println("Full Capacity");
            return false;
        }

        if ( products.contains(product)){
            System.out.println("Product already exists");
            return false;
        }
        products.add(product);
        return true;
    }

    public boolean removeProduct(int productId) {
        for (FoodProduct product : products) {
            if (product.getId() == productId) {
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    public    int totalProducts() {
        return  products.size();
    }

    public String isProductInStore(FoodProduct product) {
        for (FoodProduct p : products) {
            if (p != product && p.equals(product)) {  // Skip the same object but check equality
                return "Product exists in Store!";
            }
        }
        return "New Product!";
    }


    public String  isProductInStore2(FoodProduct product1, FoodProduct product2) {
        return product1.equals(product2) ? "Product exists in Store!" : "New Product!";
    }


    public  String searchForAproduct(FoodProduct product) {
        // there is a little questions here whitch is when i create a new product and set it same values as the previous products in teh list teh
        //methdo will display yes while i dont yet add it ot teh store so i think that i must test first if oroduct exist in store or not
        // and if  will do it i will direclty use teh isProductInStore2 for both  existing products and search
        return  products.contains(product) ? "Yes" : " Product Not FOund !";
    }

    public  String removeProductFromStore(FoodProduct product) {
        return  products.remove(product) ? "Product Removed Succesfully" : " Product Not Removed  !";
    }



    public static Store findStoreWithMostProducts(List<Store> stores) {
        if (stores == null || stores.isEmpty()) {
            System.out.println("No stores to compare.");
            return null;  // Handle empty list case
        }

        Store storeWithMostProducts = stores.get(0);
        for (Store store : stores) {
            if (store.products.size() > storeWithMostProducts.products.size()) {
                storeWithMostProducts = store;
            }
        }

        return storeWithMostProducts;
    }



    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", capacity=" + capacity +
                ", products=" + products +
                ", employees=" + listOfEmployees +
                '}';
    }
}
