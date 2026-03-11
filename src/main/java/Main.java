@SuppressWarnings("deprecation")
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new InPersonWorker("Pablo ", "Lopez", 10);
        Worker worker2 = new OnlineWorker("Pedro ", "Gonzalez", 12, 30);

        System.out.println(worker1.calculateSalary(40));
        System.out.println(worker2.calculateSalary(40));

        System.out.println(((InPersonWorker) worker1).oldSalary(40));
        System.out.println(((OnlineWorker) worker2).oldSalary(40));
    }
}
