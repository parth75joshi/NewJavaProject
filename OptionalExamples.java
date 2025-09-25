import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] args) {

        // 1. empty()
        Optional<String> emptyOpt = Optional.empty();
        System.out.println("emptyOpt: " + emptyOpt);

// 2. of()
        Optional<String> opt = Optional.of("Hello");
        System.out.println("opt: " + opt);

// 3. ofNullable()
        Optional<String> nullableOpt = Optional.ofNullable(null);
        System.out.println("nullableOpt: " + nullableOpt);

// 4. isPresent()
        System.out.println("opt is present: " + opt.isPresent());
        System.out.println("emptyOpt is present: " + emptyOpt.isPresent());

// 5. ifPresent()
        opt.ifPresent(value -> System.out.println("Value in opt: " + value));

// 6. isEmpty() (Java 11+)
        System.out.println("emptyOpt is empty: " + emptyOpt.isEmpty());

// 7. get()
        try {
            System.out.println("Value from opt: " + opt.get());
            System.out.println("Value from emptyOpt: " + emptyOpt.get()); // Will throw NoSuchElementException
        } catch (Exception e) {
            System.out.println("Exception from emptyOpt.get(): " + e);
        }

// 8. orElse()
        String value = opt.orElse("Default Value");
        System.out.println("orElse value: " + value);
        String defaultValue = emptyOpt.orElse("Default Value");
        System.out.println("orElse default value: " + defaultValue);

// 9. orElseGet()
        String valueWithSupplier = opt.orElseGet(() -> "Default Value from Supplier");
        System.out.println("orElseGet value: " + valueWithSupplier);
        String defaultValueWithSupplier = emptyOpt.orElseGet(() -> "Default Value from Supplier");
        System.out.println("orElseGet default value: " + defaultValueWithSupplier);

// 10. orElseThrow()
        try {
            String throwValue = emptyOpt.orElseThrow(() -> new IllegalArgumentException("Value not present"));
        } catch (Exception e) {
            System.out.println("Exception from orElseThrow: " + e);
        }

// 11. map()
        Optional<Integer> lengthOpt = opt.map(String::length);
        System.out.println("Mapped lengthOpt: " + lengthOpt);

// 12. flatMap()
        Optional<String> flatMapped1 = opt.flatMap(value1 -> Optional.of(value1.toUpperCase()));
        System.out.println("FlatMapped opt: " + flatMapped1);

// 13. filter()
        Optional<String> filtered = opt.filter(value2 -> value2.length() > 3);
        System.out.println("Filtered opt: " + filtered);
        Optional<String> emptyFiltered = opt.filter(value3 -> value3.length() > 10);
        System.out.println("Empty Filtered opt: " + emptyFiltered);

// 14. stream() (Java 9+)
        opt.stream().forEach(System.out::println);

// 15. or() (Java 9+)
        Optional<String> anotherOpt = opt.or(() -> Optional.of("Another Value"));
        System.out.println("Or opt: " + anotherOpt);
        Optional<String> anotherEmptyOpt = emptyOpt.or(() -> Optional.of("Another Value"));
        System.out.println("Or emptyOpt: " + anotherEmptyOpt);

// 16. equals()
        System.out.println("opt equals anotherOpt: " + opt.equals(anotherOpt));
        System.out.println("emptyOpt equals anotherEmptyOpt: " + emptyOpt.equals(anotherEmptyOpt));

// 17. hashCode()
        System.out.println("opt hashCode: " + opt.hashCode());
        System.out.println("emptyOpt hashCode: " + emptyOpt.hashCode());

// 18. toString()
        System.out.println("opt toString: " + opt.toString());
        System.out.println("emptyOpt toString: " + emptyOpt.toString());
    }
}
