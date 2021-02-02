import java.util.HashSet;
import java.util.Set;

public class StringExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");

        System.out.println("Contains A: " + set.contains("A"));
        System.out.println("Contains C: " + set.contains("C"));

        System.out.println("Size = " + set.size());
        set.add("A");
        set.add("B");
        System.out.println("Size = " + set.size());
    }
}
