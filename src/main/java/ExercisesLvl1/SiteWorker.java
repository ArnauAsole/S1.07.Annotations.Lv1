package ExercisesLvl1;

public class SiteWorker extends Worker {
    public static double fuelCost = 50.0;

    public SiteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate + fuelCost;
    }

    // Deprecated method for exercise 2
    @Deprecated
    public void oldCheckInMethod() {
        System.out.println("Checking in using an old method...");
    }
}