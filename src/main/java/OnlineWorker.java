public class OnlineWorker extends Worker {
    private final double INTERNET;

    public OnlineWorker(String name, String lastName, double priceHour, double internet) {
        super(name, lastName, priceHour);
        this.INTERNET = internet;
    }

    public double getINTERNET() {
        return INTERNET;
    }

    @Deprecated
    public double oldSalary(double hours) {
        System.out.println("obsolete method uses calculateSalary");
        return hours * getPriceHour();
    }

    @Override
    public double calculateSalary(double hours) {
        return super.calculateSalary(hours) + INTERNET;
    }
}
