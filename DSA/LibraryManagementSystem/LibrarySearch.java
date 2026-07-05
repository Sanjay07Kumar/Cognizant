package DSA.LibraryManagementSystem;


public class LibrarySearch {

    public static Book linearSearch(Book[] books,String targetTitle) {

        for (Book book : books) {

            if (book.title.equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }

        return null;
    }

    public static Book binarySearch(Book[] books,String targetTitle) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison =
                    books[mid].title.compareToIgnoreCase(targetTitle);

            if (comparison == 0) {
                return books[mid];
            }

            if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }
}