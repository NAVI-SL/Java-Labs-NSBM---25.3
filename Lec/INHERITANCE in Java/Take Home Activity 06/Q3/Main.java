package Q3;

public class Main {
    public static void main(String[] args) {
        SecurityAnalyst s1 = new SecurityAnalyst();
        s1.name = "Diana";
        s1.age = 29;
        s1.employeeId = "SA-201";
        s1.department = "SOC";
        s1.introduce();
        s1.showEmployeeInfo();
        s1.analyzeThreats();
    }
}
