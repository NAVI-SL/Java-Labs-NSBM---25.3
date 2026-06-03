package Q3;

public class SecurityAnalyst extends Employee{
    int clearanceLevel;
    
    public void analyzeThreats() {
        System.out.println("Analyst " + name + " is analysing threats at clearance level " + clearanceLevel);
    }
}
