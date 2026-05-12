public class Laptop {
    String brand = "Lenove";

    void showBrand1() {
        System.out.println("Brand: " + brand);
    }

    void showBrand2() {
        System.out.println("Brand again: " + brand);
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.showBrand1();
        l1.showBrand2();
    }
}
