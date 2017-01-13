package AutoSalon;

public abstract class Car {

    private double fuelConsumption;
    private int maxSpeed;
    private Configuration configuration;

    public Car(double fuelConsumption, int maxSpeed, Configuration configuration) {
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.configuration = configuration;
    }

    public abstract double getPrice();

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelConsumption=" + fuelConsumption +
                ", maxSpeed=" + maxSpeed +
                ", configuration=" + configuration +
                '}';
    }
}
