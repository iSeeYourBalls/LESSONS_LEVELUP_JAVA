package AutoSalon;

public class Mercedes extends Car {

    public Mercedes(double fuelConsumption, int maxSpeed, Configuration configuration) {
        super(fuelConsumption, maxSpeed, configuration);
    }

    @Override
    public double getPrice() {
        switch (getConfiguration())
        {
            case LUX:
                return 11_0000;
            case EXCLUSIVE:
                return 16_0000;
            default:return 60000;
        }
    }
}
