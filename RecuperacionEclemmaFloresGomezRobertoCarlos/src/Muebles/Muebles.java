package Muebles;

public class Muebles {
	static void mostrarMuebles(String mueble) {

		if ( mueble != "sillon" ) {
			if ( mueble != "sofa" ) { 
				System.out.println("Es una silla"); 
			} else {
				System.out.println("Es un sofa"); 
			} 
		} else {	
			System.out.println("Es un sillon"); 
		}
	}
}
