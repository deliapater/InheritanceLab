package Staff.Management;

public class Director extends Manager {
    private int budget;


    public Director(String name, String NINo, int salary, String deptName, int budget) {
        super(name, NINo, salary, deptName);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }
    
    public double payBonus() {
        return this.getSalary() * 0.02;
    }
}
