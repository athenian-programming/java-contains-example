import java.util.HashSet;
import java.util.Set;

public class StringExample {
    public static void main(String[] args) {
        Set<String> values = new HashSet<>();
        values.add("A");
        values.add("B");

        System.out.println("Contains A: " + values.contains("A"));
        System.out.println("Contains C: " + values.contains("C"));
    }
}
