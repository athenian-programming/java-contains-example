import java.util.HashSet;
import java.util.Set;

public class ObjectExample {

    public static void main(String[] args) {
        equality();
        sets1();
        sets2();
    }

    static void equality() {
        MyObj a1 = new MyObj("A");

        System.out.println("Equal1: " + (a1.equals(a1)));
        System.out.println("Equal2: " + (a1.equals(new MyObj("A"))));
        System.out.println("Equal3: " + (new MyObj("A").equals(new MyObj("A"))));
    }

    static void sets1() {
        Set<MyObj> set1 = new HashSet<>();

        MyObj a1 = new MyObj("A");
        set1.add(a1);
        System.out.println("Contains A: " + set1.contains(a1));

        System.out.println("Contains C: " + set1.contains(new MyObj("C")));

        set1.add(new MyObj("B"));
        System.out.println("Contains B: " + set1.contains(new MyObj("B")));

        MyObj a2 = new MyObj("A");
        System.out.println("Contains A2: " + set1.contains(a2));
    }

    static void sets2() {
        Set<MyObj> set1 = new HashSet<>();

        set1.add(new MyObj("A"));
        System.out.println("Set size: " + set1.size());

        set1.add(new MyObj("A"));
        System.out.println("Set size: " + set1.size());
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