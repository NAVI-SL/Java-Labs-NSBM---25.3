package Q3;

public class Employee extends Person {
    String employeeId;
    String department;

    public void showEmployeeInfo() {
        System.out.println("Employee " + employeeId + " works in " + department);
    }
}
