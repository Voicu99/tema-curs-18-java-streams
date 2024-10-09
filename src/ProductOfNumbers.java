import java.util.List;

public class ProductOfNumbers {
    public int product(List<String> numbers) {
        return numbers.stream()
                .map(Integer::parseInt)
                .reduce(1, (a, b) -> a * b);
    }
}

