public class ElectricVehicle extends Vehicle {
    int batteryLevel;

    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println(make + " battery fully charged.");
    }
}
