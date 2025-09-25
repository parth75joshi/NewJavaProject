
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

class Employee {

    int id;
    String name;
    String department;
    double salary;
    List<String> skills;

    public Employee(int id, String name, String department, double salary, List<String> skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.skills = skills;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "(" + department + "," + salary + ")";
    }
}

public class CStreamExample {

    public static void main(String[] args)  {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "IT", 70000, Arrays.asList("Java", "Spring", "SQL")),
                new Employee(2, "Bob", "HR", 50000, Arrays.asList("Communication", "Recruitment")),
                new Employee(3, "Charlie", "IT", 90000, Arrays.asList("Java", "AWS", "Docker")),
                new Employee(4, "David", "Finance", 60000, Arrays.asList("Excel", "Accounting")),
                new Employee(5, "Eva", "IT", 120000, Arrays.asList("Java", "Kubernetes", "Microservices"))
        );

        // 1. Find top paid employee in IT
        employees.stream()
                .filter(x -> "IT".equals(x.department))
                .max(Comparator.comparing(s -> s.salary))
                .ifPresent(e -> System.out.println("Top IT Employee: " + e));

        // 2. Average salary by department
        Map<String, Double> avgSalary
                = employees.stream()
                        .collect(
                                Collectors.groupingBy(x -> x.department, Collectors.averagingDouble(s -> s.salary))
                        );

        System.out.println("Average Salary is: " + avgSalary);

        // 3. Collect unique skills across all employees (flatMap)
        Set<String> uniqueSkills
                = employees.stream()
                        .flatMap(s -> s.skills.stream())
                        .collect(Collectors.toSet());

        System.out.println("Unique Skills: " + uniqueSkills);

        // 4. Partition employees into High earners (>80k) vs others
        Map<Boolean, List<Employee>> partition
                = employees.stream()
                        .collect(Collectors.partitioningBy(x -> x.salary > 80000));

        System.out.println("Earning more than 80k: " + partition.get(true));
        System.out.println("Earning less than 80k: " + partition.get(false));

        // 5. Sorted employees by salary desc, then name
        List<Employee> sorted
                = employees.stream()
                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
                                .thenComparing(Employee::getName)).toList();

        System.out.println("Sorted Employees: " + sorted);

        // 6. Map Department -> List of Names
        Map<String, List<String>> deptToNames = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.mapping(e -> e.name, Collectors.toList())
                ));
        System.out.println("Department to Names: " + deptToNames);

        // 7. mapping(): Extract just employee names into a Set
        Set<String> names
                = employees.stream()
                        .collect(mapping(Employee::getName, toSet()));

        System.out.println("Employee Names: " + names);

        // 8. collectingAndThen(): Find max salary employee and wrap result
        String topEmployee = employees.stream()
                .collect(collectingAndThen(
                        maxBy(Comparator.comparingDouble(Employee::getSalary)),
                        opt -> opt.map(Employee::getName).orElse("No Employee")
                ));
        System.out.println("Top Paid Employee (collectingAndThen): " + topEmployee);

        //10. Find Max Salary
        employees.stream()
                .max(Comparator.comparing(s -> s.salary))
                .ifPresent(e -> System.out.println("Top IT Employee: " + e));
        //11. joining(): Join all employee names into a single string
        String allEmpNames
                = employees.stream()
                        .map(Employee::getName)
                        .collect(joining(","));

        System.out.println("All Employees name: " + allEmpNames);
    }
}
