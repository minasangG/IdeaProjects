package RandomPractice;

public class EncapsulationPractice {
    
    public static void main(String[] args) {
        var Employee = new Employee(50_000, 200);
        Employee.calculateWage(Employee.getHourlyRate());
        Employee.calculateWage(5);

    }
}
