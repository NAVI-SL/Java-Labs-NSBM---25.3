public class Student {
    String StudentID;
    String name;
    int age;
    double gpa;

    public Student(String studentId, String name, double gpa, int age) {
        this.StudentID = studentId;
        this.name = name;
        this.gpa = gpa;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hello, my name is " + name + ". I am " + age + " years old and my GPA is " + gpa + ".");
    }

    void updateGpa(double newGpa) {
        gpa = newGpa;
        System.out.println("GPA updated to: " + gpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student("S12345", "Navitha", 3.5, 19);
        Student s2 = new Student("S67890", "Akitha", 3.2, 22);

        s1.introduce();
        s1.updateGpa(3.8);

        s2.introduce();
        s2.updateGpa(4);
    }

}
