//main class include main method
class DogApp{
	public static void main(String [] args){
		//declare
		Dog dog1;
		//initialize
		dog1 = new Dog();
		dog1.name = "Togo";
		dog1.age = 4;
		dog1.breed = "Siberian Husky";
		
		System.out.println("Name is: " + dog1.name);
		System.out.println("Age is: " + dog1.age);
		System.out.println("Breed name is: " + dog1.breed);
		
		System.out.println("***************************");
		
		Dog dog3;
		dog3 = new Dog("Blachy",1,"GS");
		
		//behaviour call /method call
		dog1.run();
		dog1.sleep();
		dog1.bark();
	}
}