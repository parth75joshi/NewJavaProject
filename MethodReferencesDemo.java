
import java.util.Arrays;

public class MethodReferencesDemo {
    public static void show(){
        System.out.println("Print:");  
    }

    public static void main(String[] args) {
    String[] name = {"Name1","Name2","Name3","Name4"};

    Arrays.stream(name).forEach((string) -> {
         System.out.println(string);  
    });
}    
}
