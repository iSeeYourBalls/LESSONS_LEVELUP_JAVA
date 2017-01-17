package AutoSalon;

public abstract class Car implements Action {

    private double fuelConsumption;
    private int maxSpeed;
    private Configuration configuration;
    private int speed;

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

    @Override
    public void stop() {
        speed = 0;
        System.out.println("Car is stopped. Current speed is " + speed);
    }

    @Override
    public void drive() {
        speed = maxSpeed;
        System.out.println("Car is moving. Current speed is " + speed);
    }

    @Override
    public void beep() {
        System.out.println("Beep-beep");
    }

}
