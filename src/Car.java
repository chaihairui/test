import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Supplier;

/**
 * Package : PACKAGE_NAME
 *
 * @author YixinCapital -- chaihairui
 * @Date 2018/6/29 17:02
 */

class Car {
    //Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }

    public static void main(String[] args) {
        final Car car = Car.create( Car::new );
        final List< Car > cars = Arrays.asList( car );
        cars.forEach( Car::repair );

        TreeMap<String, String> treeMap = new TreeMap<>();
    }
}