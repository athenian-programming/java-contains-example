import java.util.HashSet;
import java.util.Set;

public class ObjectExample {

    public static void main(String[] args) {
        checkEquality();
        checkSetContains();
        checkSetSize();
    }

    static void checkEquality() {
        MyObj a1 = new MyObj("A");

        System.out.println("Equal1: " + (a1.equals(a1)));
        System.out.println("Equal2: " + (a1.equals(new MyObj("A"))));
        System.out.println("Equal3: " + (new MyObj("A").equals(new MyObj("A"))));
    }

    static void checkSetContains() {
        Set<MyObj> set = new HashSet<>();

        MyObj a1 = new MyObj("A");
        set.add(a1);
        System.out.println("Contains A: " + set.contains(a1));

        System.out.println("Contains C: " + set.contains(new MyObj("C")));

        set.add(new MyObj("B"));
        System.out.println("Contains B: " + set.contains(new MyObj("B")));

        MyObj a2 = new MyObj("A");
        System.out.println("Contains A2: " + set.contains(a2));
    }

    static void checkSetSize() {
        Set<MyObj> set = new HashSet<>();

        for (int i = 0; i < 5; i++)
            set.add(new MyObj("A"));
        System.out.println("Set size: " + set.size());
    }

    static class MyObj {
        String key;

        public MyObj(String key) {
            this.key = key;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            MyObj that = (MyObj) o;
//            return key != null ? key.equals(that.key) : that.key == null;
//        }
//
//        @Override
//        public int hashCode() {
//            return key != null ? key.hashCode() : 0;
//        }
    }
}