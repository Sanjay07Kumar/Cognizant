package DSA.ECommercePlatform;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static Product linearSearch(Product[] products,String targetName) {

        for (Product product : products) {

            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products,String targetName) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison =products[mid].productName.compareToIgnoreCase(targetName);

            if (comparison == 0) {

                return products[mid];
            }
            else if (comparison < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Accessories"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Printer", "Office")
        };

        Product result1 = linearSearch(products, "Monitor");

        System.out.println("Linear Search Result:");
        System.out.println(result1);

        Arrays.sort(products,Comparator.comparing(p -> p.productName));

        Product result2 = binarySearch(products, "Monitor");

        System.out.println("\nBinary Search Result:");
        System.out.println(result2);
    }
}