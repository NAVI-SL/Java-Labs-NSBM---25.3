public class Employee {

    int empId;
    String empName;
    String department;
    double basicSalary;

    Employee(int id, String name, String dept, double salary) {
        empId = id;
        empName = name;
        department = dept;
        basicSalary = salary;
    }

    double calculateNetSalary(double bonusPercentage) {
        double netSalary;

        netSalary = basicSalary + (basicSalary * bonusPercentage / 100);

        return netSalary;
    }

    String getEmployeeSummary() {
        return "Employee ID: " + empId +
               ", Name: " + empName +
               ", Department: " + department;
    }

    void promote(String newDepartment) {
        department = newDepartment;

        System.out.println(empName +
                " has been promoted to " +
                newDepartment + ".");
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Kasun", "IT", 80000);
        Employee emp2 = new Employee(102, "Nimal", "HR", 65000);

        System.out.println(emp1.getEmployeeSummary());
        System.out.println(emp2.getEmployeeSummary());

        System.out.println("Net Salary of " + emp1.empName +
                ": Rs." + emp1.calculateNetSalary(20));

        System.out.println("Net Salary of " + emp2.empName +
                ": Rs." + emp2.calculateNetSalary(20));

        emp1.promote("Management");
    }
}
