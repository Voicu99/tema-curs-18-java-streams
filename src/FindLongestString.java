import java.util.List;

public class FindLongestString {
    public String findLongest(List<String> strings) {
        return strings.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse("No strings found");
    }
}

