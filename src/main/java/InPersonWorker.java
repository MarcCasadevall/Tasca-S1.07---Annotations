public class InPersonWorker extends Worker {
    private static double fuel;

    public InPersonWorker(String name, String lastName, double priceHour, double fuel) {
        super(name, lastName, priceHour);
        InPersonWorker.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        InPersonWorker.fuel = fuel;
    }

    @Deprecated
    public double oldSalary(double hours) {
        return hours * getPriceHour();
    }

    @Override
    public double calculateSalary(double hours) {
        return super.calculateSalary(hours) + fuel;
    }
}
