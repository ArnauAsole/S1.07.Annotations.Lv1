package ExercisesLvl1;

public class OnlineWorker extends Worker {
    private static final double INTERNET_FEE = 20.0;

    public OnlineWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate + INTERNET_FEE;
    }

    // Deprecated method for exercise 2
    @Deprecated
    public void oldConnectMethod() {
        System.out.println("Connecting using an old method...");
    }
}