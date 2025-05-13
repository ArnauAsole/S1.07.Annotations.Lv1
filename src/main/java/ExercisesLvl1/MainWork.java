package ExercisesLvl1;

public class MainWork {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Worker w1 = new Worker("John", "Smith", 15.0);
        OnlineWorker w2 = new OnlineWorker("Anna", "Lopez", 18.0);
        SiteWorker w3 = new SiteWorker("Peter", "Brown", 20.0);

        System.out.println("Normal worker salary: " + w1.calculateSalary(160));
        System.out.println("Online worker salary: " + w2.calculateSalary(160));
        System.out.println("Site worker salary: " + w3.calculateSalary(160));

        // Calling the deprecated methods
        w2.oldConnectMethod();
        w3.oldCheckInMethod();
    }
}