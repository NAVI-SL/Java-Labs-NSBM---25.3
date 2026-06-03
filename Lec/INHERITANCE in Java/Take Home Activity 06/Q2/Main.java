package Q2;

public class Main {
    public static void main(String []args) {
        Firewall f1 = new Firewall();
        f1.ipAddress = "192.168.1.1";
        f1.macAddress = "AA:BB:CC:DD:EE:FF";
        f1.firewallName = "PFSense";
        f1.connect();
        f1.blockTraffic("10.0.0.5");
        f1.allowTraffic("10.0.0.9");
        f1.disconnect();
    }
}
