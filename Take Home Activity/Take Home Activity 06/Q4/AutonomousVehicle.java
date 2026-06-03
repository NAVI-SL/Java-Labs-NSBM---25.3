package Q4;

public class AutonomousVehicle extends ElectricVehicle {
    boolean autopilotEnabled;
    
    public void enableAutopilot() {
        System.out.println("Autopilot ON for " + make);
    }
}
