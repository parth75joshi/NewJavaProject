import java.util.*;

public class HashSetDemo {

    //Set interface represents an unordered collection that stores only unique elements (no duplicates). It's implemented by classes like HashSet, TreeSet, and LinkedHashSet
    public static void main(String args[])
    {
        HashSet<String> hs = new HashSet<>();
        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}