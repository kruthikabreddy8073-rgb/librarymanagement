import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>(List.of("Java", "Python", "DSA"));
        books.remove("DSA");
        System.out.println(books);
        System.out.println("hi");
    }
}
