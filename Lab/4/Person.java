public class Person {
      private String firstName;
      private String lastName;
      
      //constructor
      public Person(String fname, String lname) {
        firstName = fname;
        lastName = lname;
      }

      public void disPlay(){
        System.out.println(firstName + "" + lastName);
      }

      public static void main(String[] args) {
        
        //new object
        Person p1 = new Person("Navitha" , "Navindul");
        p1.disPlay();
      }
}
