package Q2;
public class Firewall extends NetworkDevice{
    String firewallName;

    public void blockTraffic(String source) {
        System.out.println(firewallName + "blocked traffic from" + source);
    }
    
    public void allowTraffic(String source) {
        System.out.println(firewallName + "allowed traffic from" + source); 
    }
}