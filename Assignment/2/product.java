public class product {
    String productID;
    String productName;
    double unitPrice;

    product() {
        productID = "0";
        productName = "Unknown";
        unitPrice = 0.00;
    }

    product(String id, String name, double price) {
        productID = id;
        productName = name;
        unitPrice = price;
    }

    void applyDiscount(double percentage) {
        unitPrice = unitPrice - (unitPrice * percentage / 100);
        System.out.println("Updated Price after " + percentage + "% discount: Rs." + unitPrice);
    }

    String getProductLabel() {
        return productID + " - " + productName + " - Rs." + unitPrice;
    }

    public static void main(String[] args) {
        product p1 = new product();

        product p2 = new product("101", "Laptop", 150000);

        p2.applyDiscount(15);

        System.out.println("Product 1: " + p1.getProductLabel());
        System.out.println("Product 2: " + p2.getProductLabel());

    }
}

