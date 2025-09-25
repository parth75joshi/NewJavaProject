
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class CollectionDemo1{
	public static void main(String[] args){
			LinkedList<String> linkedList = new LinkedList<>();	
		linkedList.add("name1");
		linkedList.addFirst("start");
        linkedList.addLast("end");
        linkedList.remove("name1");

        System.out.println(linkedList.indexOf("start"));   


        Set<String> set = new HashSet<>();
        set.add("name1");
        set.add("name2");
        set.add("name1");

        for(String s : set) 
            System.out.println(s);

        System.out.println("-----------------------------------------------------------------------------------");

        Set<String> s = new LinkedHashSet<>();
        s.add("name1");
        s.add("name2");
        s.add("name3");
        s.add("name2");

        for(String s1 : s)
            System.out.println(s1);


        System.out.println("-----------------------------------------------------------------------------------");


        Set<String> tree = new TreeSet<>();
        tree.add("name2");
        tree.add("name1");
        tree.add("name3");

        for(String s2: tree)
            System.out.println(s2);


        Map<Integer, String> map = new HashMap<>();
        // Adding key-value pairs
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(2, "Go"); // Key 2 updated with new value "Go"
        map.put(null, "NullKey"); // Null key
        map.put(4, null);         // Null value
        map.put(5, null);         // Another null value

        // Printing the entire map
        System.out.println("Map: " + map);

        // Accessing a value
        System.out.println("Value for key 1: " + map.get(1));

        // Iterating using for-each (entrySet)
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Iterating keys only
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // Iterating values only
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        // Checking if a key exists
        System.out.println("Contains key 3? " + map.containsKey(3));

        // Checking if a value exists
        System.out.println("Contains value 'Java'? " + map.containsValue("Java"));

        // Removing a key
        map.remove(4);
        System.out.println("After removing key 4: " + map);



        // Create LinkedHashMap
        Map<Integer, String> lhm = new LinkedHashMap<>();

        // Add key-value pairs
        lhm.put(3, "C++");
        lhm.put(1, "Java");
        lhm.put(2, "Python");
        lhm.put(4, "Go");

        // Print map
        System.out.println("LinkedHashMap: " + lhm);

        // Iterating using for-each
        for (Map.Entry<Integer, String> entry : lhm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }



         // TreeMap with natural ordering
        TreeMap<Integer, String> tmap = new TreeMap<>();

        tmap.put(3, "C++");
        tmap.put(1, "Java");
        tmap.put(4, "Go");
        tmap.put(2, "Python");

        // Print map
        System.out.println("TreeMap: " + tmap);

        // Iterating through entries
        for (Map.Entry<Integer, String> entry : tmap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Some TreeMap methods
        System.out.println("First Key: " + tmap.firstKey());
        System.out.println("Last Key: " + tmap.lastKey());
        System.out.println("Higher Key(2): " + tmap.higherKey(2));
        System.out.println("Lower Key(3): " + tmap.lowerKey(3));

        Queue<Integer> queue = new LinkedList(); 
        queue.add(21);
        queue.add(14);
        System.out.println(queue.poll());


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(54);
        pq.add(47);
        System.out.println(pq.poll());

	}	
}