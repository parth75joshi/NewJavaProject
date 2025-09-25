import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Sample{

    abstract void FunName();
}

public class LambdaExpressionsDemo {
    public static void main(String[] args) {
        Sample sample = new Sample(){
            @Override
            public void FunName() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };


        Sample sample1 = () -> System.out.println("In Fun Method!");
        sample1.FunName();

         // Consumer that prints a string
        Consumer<String> consumer = s -> System.out.println("Hello, " + s);
        consumer.accept("Java");   // Output: Hello, Java
        consumer.accept("World");  // Output: Hello, World

        // Predicate to check if number is even
        Predicate<Integer> isEven = n -> (n % 2 == 0);
        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(7));  // false

         // Function to get length of string
        Function<String, Integer> lengthFunction = str -> str.length();

        System.out.println(lengthFunction.apply("Java"));     // 4
        System.out.println(lengthFunction.apply("Lambda"));   // 6

         // Supplier that generates a random number
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);
        System.out.println(randomSupplier.get()); // e.g., 42
        System.out.println(randomSupplier.get()); // e.g., 87
    }
}
