public class Teacher {
    private String name;
    private String subject;
    
    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher();

        t1.setName("Navitha");
        t1.setSubject("OOP with Java");

        System.out.println(t1.getName());
        System.out.println(t1.getSubject());
    }
}
