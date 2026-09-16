package inClassSep16;

public class Dog {
	String name;
	String breed;
	int age;
	
	public Dog() {
		
	}
	
	public Dog(String name, String breed, int age) {
		this.name=name;
		this.breed=breed;
		this.age=age;
	}
	
	public void show() {
		System.out.printf("Name:  %s\n",this.name);
		System.out.printf("Breed: %s\n",this.breed);
		System.out.printf("Age:   %d\n",this.age);
	}
}
