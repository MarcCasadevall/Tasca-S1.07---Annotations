public class OnlineWorker extends Worker {
    private final double internet;

    public OnlineWorker(String name, String lastName, double priceHour, double internet) {
        super(name, lastName, priceHour);
        this.internet = internet;
    }

    public double getInternet() {
        return internet;
    }

    @Override
    public double calculateSalary(double hours) {
        return super.calculateSalary(hours) + internet;
    }
}
