import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategoryWithHighestAveragePrice {
    public String findCategory(List<Product> products) {
        Map<String, Double> categoryAvgPrice = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));

        return categoryAvgPrice.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No category found");
    }
}

