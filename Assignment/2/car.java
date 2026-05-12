public class car {
    int year;
    String brand;
    double price;

    car() {
        year = 2000;
        brand = "Unknown";
        price = 0.00; 
    }

    void displayInfo() {
        System.out.println("Car Information ");
        System.out.println("Car Year :" + year);
        System.out.println("Car Brand:" + brand);
        System.out.println("Car Price " + price);
    }

    public static void main(String[] args) {
        car car1 = new car();
        car1.displayInfo();
    }
}

