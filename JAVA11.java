
import java.util.function.BiFunction;

public class JAVA11 {
    public static void main(String[] args){
        BiFunction<Integer, Integer, Integer> df = (var a , var b) -> a+b;
        System.out.println(df.apply(5,4)); 

    } 
}
