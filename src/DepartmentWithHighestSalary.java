import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWithHighestSalary {
    public String findDepartment(List<Employee> employees) {
        Map<String, Double> departmentSalaries = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));

        return departmentSalaries.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No department found");
    }
}

