@SuppressWarnings("deprecation")
public class Main {
    public static void main(String[] args) {
        Worker w1 = new InPersonWorker("Pablo ", "Lopez", 10, 80);
        Worker w2 = new OnlineWorker("Pedro ", "Gonzalez", 12, 30);

        System.out.println(w1.calculateSalary(40));
        System.out.println(w2.calculateSalary(40));

        System.out.println(((InPersonWorker) w1).oldSalary(40));
        System.out.println(((OnlineWorker) w2).oldSalary(40));
    }
}
