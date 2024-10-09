import java.util.List;
import java.util.stream.Collectors;

public class TransformStringsToLengths {
    public List<Integer> transform(List<String> strings) {
        return strings.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }
}

