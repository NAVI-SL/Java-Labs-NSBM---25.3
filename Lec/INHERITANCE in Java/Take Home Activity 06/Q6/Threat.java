package Q6;

public class Threat {
    String threatId;
    String source;
    String severity;

    public void logThreat() {
        System.out.println("[THREAT LOG] ID: " + threatId);
    }
}
