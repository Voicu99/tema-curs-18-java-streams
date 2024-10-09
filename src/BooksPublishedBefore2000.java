import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BooksPublishedBefore2000 {
    public Map<String, List<String>> findBooks(List<Book> books) {
        return books.stream()
                .filter(b -> b.getYearOfPublication() < 2000)
                .collect(Collectors.groupingBy(Book::getAuthor,
                        Collectors.mapping(Book::getTitle, Collectors.toList())));
    }
}

