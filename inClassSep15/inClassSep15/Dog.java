package inClassSep15;

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
		System.out.printf("Name: %s\nBreed: %s\nAge: %d\n", this.name,this.breed,this.age);
	}

}
