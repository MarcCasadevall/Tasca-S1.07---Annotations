public class Worker {
    private String name;
    private String lastName;
    private double priceHour;

    public Worker(String name, String lastName, double priceHour) {
        this.name = name;
        this.lastName = lastName;
        this.priceHour = priceHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(double priceHour) {
        this.priceHour = priceHour;
    }

    public double calculateSalary(double hours) {
        return hours * priceHour;
    }
}
