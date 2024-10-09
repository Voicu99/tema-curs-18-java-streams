import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindPrimeNumbers {
    public List<Integer> findPrimes() {
        return IntStream.rangeClosed(1, 100)
                .filter(this::isPrime)
                .boxed()
                .collect(Collectors.toList());
    }

    private boolean isPrime(int number) {
        return number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i == 0);
    }
}

