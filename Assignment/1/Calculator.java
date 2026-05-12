public class Calculator  {
	
    void add() {
        int a = 15, b = 35;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(); 
    }
}


