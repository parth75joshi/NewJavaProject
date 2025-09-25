
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        // ArrayList<Integer> al = new ArrayList<Integer>();        
        // al.add(2);
        // al.add(5);
        // al.add(70);
        // al.add(25);
        // al.add(20);

        // System.out.println("Print Array: " + al);
        // List<Integer> nums = al.stream().filter(n -> n%10 == 0).collect(Collectors.toList());
        // System.out.println("Print only Even array element: " + nums);
        Employee[] employees = {
            new Employee(1, "Employee1", 20000),
            new Employee(2, "Employee2", 40000),
            new Employee(3, "Employee3", 30000)
        };

        System.out.println(Stream.of(employees));

        List<Employee> lstEmp = Arrays.asList(employees);
        System.out.println(lstEmp.stream());
        System.out.println(Stream.of(employees[0]));

        List<String> longString = Arrays.asList("100", "200", "400", "300");
        LongStream longStream = longString.stream().mapToLong(Long::parseLong);
        longStream.forEach(System.out::println);

        String sampleString = "Hello\nWorld";
        System.out.println(sampleString.indent(4));
        String upperCaseString = sampleString.transform(s -> s.toUpperCase());
        System.out.println(upperCaseString);

        try {
            Path file1 = Files.createTempFile("temp1", ".txt");
            Path file2 = Files.createTempFile("temp2", ".txt");

            Files.writeString(file1, "I love Java");
            Files.writeString(file2, "I love Technology");

            long filemishMatch = Files.mismatch(file1, file2);
            System.out.println("Mishmatches: " + filemishMatch);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(getDayType("Monday")); 

        String codingLanguage = "Java";
        String stringTemplate = "${codingLanguage} is awesome";
        System.out.println(stringTemplate);
    }

    public static String getDayType(String day) {
        var result = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                yield "Weekday";
            case "Saturday", "Sunday":
                yield "Weekend";
            default:
                yield "Invalid day.";
        };

        return result;
    }
}

class Employee {

    public Employee(int id, String name, float salary) {
        Id = id;
        Name = name;
        Salary = salary;
    }

    private int Id;
    private String Name;
    private float Salary;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }
}
