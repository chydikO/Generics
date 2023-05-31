import com.itstep.model.Car;
import com.itstep.model.User;
import com.itstep.task1.Generic;
import com.itstep.task2.GenericTask2;

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
        Integer[] integers = {14, 12, -10, 115, 25};
        GenericTask2 genericTask2_1 = new GenericTask2<>(integers);
        genericTask2_1.setElementSize(15);
        System.out.println(genericTask2_1.getElementSize());

        System.out.println("Min element: " + genericTask2_1.getMinElement());
        System.out.println("Max element: " + genericTask2_1.getMaxElement());
        System.out.println("Avr element: " + genericTask2_1.getAverengeElement());
        System.out.println(genericTask2_1);
        System.out.println(STRING_SEPARATOR);

        User[] users = {new User(), new User(), new User(), new User(), new User()};
        GenericTask2 genericTask2_2 = new GenericTask2<>(users);
        genericTask2_2.setElementSize(15);
        System.out.println("Min element: " + genericTask2_2.getMinElement());
        System.out.println("Max element: " + genericTask2_2.getMaxElement());
        System.out.println("Avr element: " + genericTask2_2.getAverengeElement());
        System.out.println(genericTask2_2);

        System.out.println("-".repeat(20));
        System.out.println("Task - 3");
        Car[] cars = {new Car("BMW", 2020),
                new Car("Ford", 2015),
                new Car("Audi", 2021)
        };
        GenericTask2<Car> genericTask3 = new GenericTask2<>(cars);
        try {
            System.out.println("Min element: " + genericTask3.getMinElement());
        } catch (ClassCastException exception) {
            System.err.println("не працює, тому що клас GenericTask2 працює тільки з класом якій реалізує методи інтерфейса Comparable");
        }

    }
}