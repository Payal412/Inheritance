package javaPackage;

public class Max extends Hospital{

	@Override
	void hospitalName() {
        System.out.println("This is a hospital");
    }
	
	@Override
    void hospitalLocation() {
        System.out.println("Max hospital is located in Mumbai");
    }
    void maxSpeciality() {
        System.out.println("Max hospital is known for neurology");
    }
}
