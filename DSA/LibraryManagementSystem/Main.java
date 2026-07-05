package DSA.LibraryManagementSystem;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Book[] books = {
                
                new Book(101,"Java Programming","James Gosling"),

                new Book(102,"Data Structures","Mark Allen"),

                new Book(103,"Operating Systems","Abraham Silberschatz"),

                new Book(104,"Computer Networks","Andrew Tanenbaum"),

                new Book(105,"Database Systems","Elmasri")
        };

        Book linearResult =LibrarySearch.linearSearch(books,"Computer Networks");

        System.out.println("Linear Search Result:");

        if (linearResult != null) {
            System.out.println(linearResult);
        } else {
            System.out.println("Book Not Found");
        }

        Arrays.sort(books,Comparator.comparing(b -> b.title));

        Book binaryResult =LibrarySearch.binarySearch(books,"Computer Networks");

        System.out.println("\nBinary Search Result:");

        if (binaryResult != null) {
            System.out.println(binaryResult);
        } else {
            System.out.println("Book Not Found");
        }
    }
}