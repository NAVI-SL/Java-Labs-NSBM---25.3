//main method
public class FamilyApp {
    public static void main(String[] args) {
        Father f = new Father();
        f.car = "BMW";
        f.phone = "Iphone 18 pro max";

        //calling methods
        f.travel();
        f.call();

        System.out.println("**");

        //son class
        Son s1 = new Son();
        s1.laptop = "MacBook Pro";

        s1.code();

        s1.phone = "iPhone 14";
        s1.car = "Audi A8";

        s1.travel();
        s1.call();
    }
}
