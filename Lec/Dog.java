package Lec;

//class
class Dog {
       //variables /properties /state /attributes
       String name;
       int age;
       String breed;
       
       //constructor
       Dog(){
           System.out.println("Welcome to the dog APP");
       }
       
       //parameterized constructor
       Dog(String name, int age, String breed){
           this.name = name;
           this.age = age;
           this.breed = breed;
       }
		
       //method /behaviors
       void run(){
           System.out.println("Run Fast");
       }
       void sleep(){
           System.out.println("Peacefully");
       }
       void bark(){
           System.out.println("woof woof");
       }  
}

