package javaPackage;

public class Apollo extends Hospital{

	@Override
	void hospitalName() {
        System.out.println("This is a hospital");
    }
	
	@Override
    void hospitalLocation() {
        System.out.println("Apollo hospital is located in Pune");
    }
    void apolloSpeciality() {
        System.out.println("Apollo hospital is known for cardiology and cardiothoracic surgery");
    }
}
