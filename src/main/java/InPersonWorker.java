public class InPersonWorker extends Worker {

    private static double fuel = 15; //

    public InPersonWorker(String name, String lastName, double priceHour) {
        super(name, lastName, priceHour);
    }

    public static double getFuel() {
        return fuel;
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