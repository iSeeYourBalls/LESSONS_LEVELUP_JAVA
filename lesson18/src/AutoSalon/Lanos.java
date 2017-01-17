package AutoSalon;

public class Lanos extends Car {

    public Lanos(double fuelConsumption, int maxSpeed, Configuration configuration) {
        super(fuelConsumption, maxSpeed, configuration);
    }

    @Override
    public double getPrice() {
        switch (getConfiguration())
        {
            case LUX:
                return 10_000;
            case EXCLUSIVE:
                return 15_000;
            default:return 5000;
        }
    }

    @Override
    public void beep() {
        System.out.println("Beeeep! Beep-beep");
    }

}
