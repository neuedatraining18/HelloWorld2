import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingLists {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sonya");
        names.add("Duane");
        names.add("Anna");
        names.add("Kenny");
        names.add("Kaveri");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);


        //Sorting lists of objects
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Uncharted", "Tom Holland", 199));
        books.add(new Book("Fantastic Beasts", "Eddie Redmayne", 345));
        books.add(new Book("Fantastic Beasts", "Eddie Redmayne", 345));
        books.add(new Book("Fantastic Beasts", "Eddie Redmayne", 345));
        books.add(new Book("The Lost City","Sandra Bullock", 500));

        Collections.sort(books);
        System.out.println(books);

        //streams
        List<Book> longerBooks = books.stream().distinct()
                .filter((b) -> {
                    return b.getNumberOfPages()>200;
                })
                .filter(b -> b.getNumberOfPages()>200)
                .collect(Collectors.toList());
        System.out.println("Longer books");
        System.out.println(longerBooks);

        //List<Integer> pages = books.stream().map(b -> )

    }
}
