import java.nio.file.*;
import java.io.IOException;
import java.util.Arrays;

public class LongestWordInFile {
    public String findLongestWord(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .max((w1, w2) -> Integer.compare(w1.length(), w2.length()))
                .orElse("No words found");
    }
}

