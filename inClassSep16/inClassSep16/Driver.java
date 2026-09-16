package inClassSep16;

public class Driver {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.name = "Gibbs";
		dog1.breed = "Dachshund";
		dog1.age=2;
		
		Dog dog2 = new Dog("Mosby","Mixed",4);
	
		Dog dog3=dog2;
		dog3.name="Clifford";
		dog1=dog2;
		dog1.show();
		dog2.show();
		dog3.show();

	}

}
