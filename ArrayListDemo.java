import java.util.*;

class ArrayListDemo {

    // Main Method
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 1; i <= 5; i++)
            al.add(i);

        System.out.println(al);

        al.remove(3);

        System.out.println(al);

        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " " + "Test");
    }
}