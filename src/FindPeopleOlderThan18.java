import java.util.List;
import java.util.stream.Collectors;

public class FindPeopleOlderThan18 {
    public List<String> find(List<Person> people) {
        return people.stream()
                .filter(p -> p.getAge() > 18)
                .map(p -> p.getFirstName() + " " + p.getLastName())
                .collect(Collectors.toList());
    }
}

