
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFileDemo {

    public static void main(String[] args) {
        try (Stream<String> file = Files.lines(Paths.get("D:JAVADemo.txt"))) {
            List<String> filteredString
                    = filterAndConvertToUpper(file, 5);

            System.out.println(
                    "Filtered strings with length 5 (converted to uppercase): "
                    + filteredString);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static List<String> filterAndConvertToUpper(Stream<String> stream, int length) {
        return stream.filter(s -> s.length() == length)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }

    private static void WriteFile() {
        String[] words
                = {"Geeks", "for", "Geeks", "Hello", "World"};

        String fileName = "D:/JAVADemo.txt";

        // Step 1: Create a PrintWriter to write to the
        try (PrintWriter pw
                = new PrintWriter(Files.newBufferedWriter(
                        Paths.get(fileName)))) {

            // Step 2: Use Stream to write each word to the
            Stream.of(words).forEach(pw::println);

            // Step 3: Print success message to the console
            System.out.println(
                    "Words written to the file successfully.");
        } catch (IOException e) {
            // Step 4: Handle any IO exception that occurs
            // during the file writing process
            e.printStackTrace();
        }
    }
}
