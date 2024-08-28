import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCode {
    public static void main(String[] args) {
        User u = new User("Lol", 23);
        System.out.println(u.getAge());

        List<Integer> ints = List.of(1, -2, 300, 24, 5, 6, 17, 8, 93, 10);

        List<Integer> i = new ArrayList<>(ints);
        // i.addAll(ints);
        System.out.println(ints);

        Collections.sort(i);
        System.out.println(i);
    }

    static class User {
        public User(String name, int age) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        String name;
        int age;
    }
}
