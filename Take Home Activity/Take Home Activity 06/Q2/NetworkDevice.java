package Q2;
public class NetworkDevice {
    String ipAddress;
    String macAddress;
    
    public void connect() {
        System.out.println("Connecting device with IP: " + ipAddress);
    }

    public void disconnect() {
        System.out.println("Device " + ipAddress + " disconnected");
    }
}
