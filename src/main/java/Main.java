import com.itstep.model.User;
import com.itstep.task1.Generic;

public class Main {
    private static final String STRING_SEPARATOR = new String("-".repeat(5) + " " + "-".repeat(5));

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user);

        System.out.println("Task - 1");
        Generic<Integer, String, Double> generic0 = new Generic<>(5, "Hello", 3.5);
        System.out.println(generic0);
        System.out.println(STRING_SEPARATOR);

        Generic<Float, Boolean, Object> generic1 = new Generic<>(3.1f, true, new Object());
        System.out.println(generic1);
        System.out.println(STRING_SEPARATOR);

        Generic<Long, Integer, Character> generic2 = new Generic<>(1880545L, 457, 'H');
        System.out.println(generic2);
        System.out.println(STRING_SEPARATOR);

        Generic<User, Integer, Boolean> generic3 = new Generic<>(user, 123, false);
        System.out.println(generic3);
        System.out.println("-".repeat(20));
        System.out.println("Task - 2");


        System.out.println("-".repeat(20));
        System.out.println("Task - 3");
    }
}