package Staff;

public abstract class Employee {
    private String name;
    private String NINo;
    private int salary;

    public Employee(String name, String NINo, int salary) {
        this.name = name;
        this.NINo = NINo;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public String getNINo() {
        return NINo;
    }

    public int getSalary() {
        return salary;
    }


    public void setName(String name) {
        if (name != null)
           this.name = name;
    }


    public double raiseSalary(double raise) {
        if(raise >= 0)
      return this.salary += raise;
        else return this.salary;
    }




    public double payBonus() {
        return this.salary * 0.01;
    }


}





