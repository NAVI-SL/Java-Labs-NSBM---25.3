package Q2;

public class Printer {

    void printData(String text) {
        System.out.println("Printing text: " + text);
    }

    void printData(int number) {
        System.out.println("Printing number: " + number);
    }

    void printData(String text, int copies) {
        System.out.println("Printing " + copies + "copies of: " + text);
    }

    void printData(boolean isDuplex) {
        System.out.println("Duplex printing: " + isDuplex);
    }
}
