public class Student extends Person {
    private String course;

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    //display all the details
    public void displayAll() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Course: " + getCourse());
    }

    
}
