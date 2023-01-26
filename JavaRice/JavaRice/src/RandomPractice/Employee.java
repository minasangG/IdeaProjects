package RandomPractice;

public class Employee {

    private String employeeName;
    private int baseSalary;
    private int hourlyRate;
    public int mortgageAmount;

    public int calculateWage (int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base Salary cannot be set to 0 or less.");
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public int getHourlyRate() {
        return hourlyRate;
    }
    public Employee (int baseSalary, int hourlyRate) {
        System.out.println(baseSalary);
        System.out.println(hourlyRate);
    }
    public void calculateMortgage (int mortgageAmount) {
        this.mortgageAmount = mortgageAmount;
    }
}

