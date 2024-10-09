import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentWord {
    public String find(List<String> sentences) {
        Map<String, Long> wordCount = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return wordCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No words found");
    }
}

