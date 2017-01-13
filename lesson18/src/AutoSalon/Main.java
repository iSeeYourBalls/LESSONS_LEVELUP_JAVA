package AutoSalon;

import java.util.Arrays;

/**
 * Created by java on 13.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Lanos(8.8,140, Configuration.BASIC),
                new Lanos(10.,160, Configuration.LUX),
                new Mercedes(14.4, 220, Configuration.BASIC),
                new Mercedes(25., 280, Configuration.EXCLUSIVE),
                new Opel(7.5, 140, Configuration.BASIC),
                new Opel(9.5, 180, Configuration.LUX)
        };

        AutoSalon autoSalon = new AutoSalon(cars);

        System.out.println("\n");
        System.out.println("Total price " + autoSalon.calculateCarsPrice());

        System.out.println(Arrays.toString(autoSalon.sortByFuelConsumption()));
        System.out.println(Arrays.toString(autoSalon.getCarsBySpeedRange(160, 220)));
    }
}
