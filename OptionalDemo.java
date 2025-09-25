import java.util.Optional;

public class OptionalDemo{
    public static void main(String[] args) {
        // 1. Empty Optional
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent()); // false

        // 2. Optional with non-null value
        Optional<String> opt1 = Optional.of("Java");
        System.out.println(opt1.get()); // "Java"

        // 3. Optional with nullable value
        Optional<String> opt2 = Optional.ofNullable(null);
        System.out.println(opt2.orElse("Default Value")); // "Default Value"
    }
}
