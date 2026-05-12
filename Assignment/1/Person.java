class Person {
    private int age;

    void setAge(int a) {   
        age = a;
    }

    int getAge() {  
        return age;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(19);

        System.out.println("Age: " + p1.getAge());
    }
}

