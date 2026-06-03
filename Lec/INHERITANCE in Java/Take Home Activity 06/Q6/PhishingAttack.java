package Q6;

public class PhishingAttack extends Thread {
    String targetEmail;

    public void blockEmail() {
        System.out.println("Blocking phishing email targeting: " + targetEmail);
    }
}
