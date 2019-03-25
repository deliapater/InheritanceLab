package Staff.Management;

import Staff.Employee;


public class Manager extends Employee {
    private  String deptName;

    public Manager(String name, String NINo, int salary, String deptName) {
        super(name, NINo, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }


}
