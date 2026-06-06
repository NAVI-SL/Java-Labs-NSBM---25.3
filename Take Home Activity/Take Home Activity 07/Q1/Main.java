public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.add(10, 20);
        calc.add(5.5, 4.5);
        calc.add(10, 20, 30);
        calc.add("Hello ", "Java");
    }
}
