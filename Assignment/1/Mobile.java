public class Mobile {
    String model;

    void displayModel() {
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.model = "Apple";
        m1.displayModel();
    }
}
