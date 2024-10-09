import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStrings {
    public String concatenate(List<String> strings) {
        return strings.stream()
                .collect(Collectors.joining(", "));
    }
}

