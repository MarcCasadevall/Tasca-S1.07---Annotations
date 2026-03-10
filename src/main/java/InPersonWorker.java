public class InPersonWorker extends Worker {
    private double fuel;

    public InPersonWorker(String name, String lastName, double priceHour, double fuel) {
        super(name, lastName, priceHour);
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Deprecated
    public double oldSalary(double hours) {
        System.out.println("obsolete method, use calculateSalary instead");
        return calculateSalary(hours);
    }

    @Override
    public double calculateSalary(double hours) {
        return super.calculateSalary(hours) + fuel;
    }
}
