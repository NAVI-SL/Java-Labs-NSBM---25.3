class TimmyAPP {
	public static void main(String [] args){
		//declare
		Dog dog1;
		//initialize
		dog1 = new Dog();
		dog1.name = "Timmy";
		dog1.age = 5;
		dog1.breed = "Golden Retriever";
		
		System.out.println("Name is: " + dog1.name);
		System.out.println("Age is: " + dog1.age);
		System.out.println("Breed name is: " + dog1.breed);
		
		//behaviour call /method call
		dog1.run();
		dog1.sleep();
		dog1.bark();
	}
}