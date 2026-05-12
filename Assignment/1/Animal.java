public class Animal {
    String type;

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        a1.type = "Cat";
        a2.type = "Dog";

        System.out.println(a1.type);
        System.out.println(a2.type);
    }
}

