import java.util.List;

public class TotalNumberOfCharacters {
    public long count(List<String> strings) {
        return strings.stream()
                .flatMapToInt(String::chars)
                .filter(c -> !Character.isWhitespace(c))
                .count();
    }
}

