package DSA.InventoryManagementSystem;

public class Main {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        manager.addProduct( new Product(101,"Laptop",20,55000));

        manager.addProduct( new Product(102,"Mouse",100,500));

        manager.displayProducts();

        manager.updateProduct(101,"Gaming Laptop",15,65000);

        manager.deleteProduct(102);

        System.out.println("\nUpdated inventory:");

        manager.displayProducts();
    }
}