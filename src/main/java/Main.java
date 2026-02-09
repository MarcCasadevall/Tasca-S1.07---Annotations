@SuppressWarnings("deprecation")
public class Main {
    public static void main(String[] args) {
        InPersonWorker person = new InPersonWorker("Pablo ", "Lopez", 10, 80);
        OnlineWorker online = new OnlineWorker("Pedro ", "Gonzalez", 12, 30);

        System.out.println(person.calculateSalary(40));
        System.out.println(online.calculateSalary(40));


        System.out.println(person.oldSalary(40));
        System.out.println(online.oldSalary(40));
    }
}
