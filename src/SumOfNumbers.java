import java.util.Arrays;

public class SumOfNumbers {
    public int sum(Integer[] numbers) {
        return Arrays.stream(numbers)
                .reduce(0, Integer::sum);
    }
}

