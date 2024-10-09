import java.io.IOException;
import java.util.*;

public class StreamOperationsApp {

    public static void main(String[] args) throws IOException {
        // Task 1: Filter Even Numbers
        FilterEvenNumbers task1 = new FilterEvenNumbers();
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);
        System.out.println("Even Numbers: " + task1.filter(numbers));

        // Task 2: Find Longest String
        FindLongestString task2 = new FindLongestString();
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        System.out.println("Longest String: " + task2.findLongest(strings));

        // Task 3: Find Prime Numbers from 1 to 100
        FindPrimeNumbers task3 = new FindPrimeNumbers();
        System.out.println("Prime Numbers: " + task3.findPrimes());

        // Task 4: Concatenate Strings with a comma
        ConcatenateStrings task4 = new ConcatenateStrings();
        List<String> stringList = Arrays.asList("one", "two", "three", "four");
        System.out.println("Concatenated String: " + task4.concatenate(stringList));

        // Task 5: People older than 18
        FindPeopleOlderThan18 task5 = new FindPeopleOlderThan18();
        List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));
        System.out.println("People older than 18: " + task5.find(people));

        // Task 6: Sum of numbers in an array
        SumOfNumbers task6 = new SumOfNumbers();
        Integer[] numberArray = {1, 2, 3, 4, 5};
        System.out.println("Sum of Numbers: " + task6.sum(numberArray));

        // Task 7: Transform Strings into their respective lengths
        TransformStringsToLengths task7 = new TransformStringsToLengths();
        List<String> strings2 = Arrays.asList("Hello", "World", "Java", "Streams");
        System.out.println("String Lengths: " + task7.transform(strings2));

        // Task 8: Count the number of vowels in a sentence
        CountVowels task8 = new CountVowels();
        String sentence = "Hello World";
        System.out.println("Number of Vowels: " + task8.count(sentence));

        // Task 9: Find the most frequent word in sentences
        MostFrequentWord task9 = new MostFrequentWord();
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");
        System.out.println("Most Frequent Word: " + task9.find(sentences));

        // Task 10: Total number of characters excluding whitespaces
        TotalNumberOfCharacters task10 = new TotalNumberOfCharacters();
        List<String> stringList2 = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");
        System.out.println("Total Number of Characters (excluding whitespaces): " + task10.count(stringList2));

        // Task 11: Find longest word in a text file
        LongestWordInFile task11 = new LongestWordInFile();
        // Replace "path/to/your/textfile.txt" with the actual file path
        // System.out.println("Longest Word in File: " + task11.findLongestWord("path/to/your/textfile.txt"));

        // Task 12: Department with the highest total salary
        DepartmentWithHighestSalary task12 = new DepartmentWithHighestSalary();
        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT", 50000),
                new Employee("Jane", "HR", 60000),
                new Employee("Bob", "IT", 70000)
        );
        System.out.println("Department with Highest Salary: " + task12.findDepartment(employees));

        // Task 13: Product of numbers represented as strings
        ProductOfNumbers task13 = new ProductOfNumbers();
        List<String> numberStrings = Arrays.asList("1", "2", "3", "4", "5");
        System.out.println("Product of Numbers: " + task13.product(numberStrings));

        // Task 14: Category with the highest average price
        CategoryWithHighestAveragePrice task14 = new CategoryWithHighestAveragePrice();
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200),
                new Product("Phone", "Electronics", 800),
                new Product("Table", "Furniture", 300),
                new Product("Chair", "Furniture", 150)
        );
        System.out.println("Category with Highest Average Price: " + task14.findCategory(products));

        // Task 15: Books published before 2000, grouped by author
        BooksPublishedBefore2000 task15 = new BooksPublishedBefore2000();
        List<Book> books = Arrays.asList(
                new Book("Book 1", "Author A", 1999),
                new Book("Book 2", "Author B", 2005),
                new Book("Book 3", "Author A", 1998)
        );
        System.out.println("Books published before 2000: " + task15.findBooks(books));
    }
}

