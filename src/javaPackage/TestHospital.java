package javaPackage;

public class TestHospital {

	public static void main(String[] args) {
		
		// Creating objects of child classes
        Apollo apollo = new Apollo();
        apollo.hospitalName(); // Calling methods from child classes
        apollo.hospitalLocation();
        apollo.apolloSpeciality();
        
        Fortis fortis = new Fortis();
        fortis.hospitalName();
        fortis.hospitalLocation();
        fortis.fortisSpeciality();
        
        Max max = new Max();
        max.hospitalName();
        max.hospitalLocation();
        max.maxSpeciality();
        
        // Casting to parent class object
        Hospital h1 = apollo;
        Hospital h2 = fortis;
        Hospital h3 = max;
        
        // Calling methods from parent class through parent class objects
        h1.hospitalName();
        h1.hospitalLocation(); 
        h1.hospitalSpeciality();
        
        // Down casting
        Apollo apollo1 = (Apollo) h1;
        Fortis fortis1 = (Fortis) h2;
        Max max1 = (Max) h3;
        
        // Calling methods from child classes through down casted objects
        apollo1.apolloSpeciality();
        fortis1.fortisSpeciality();
        max1.maxSpeciality();
    }
}