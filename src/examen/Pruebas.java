package examen;

import datos.Examen;

public class Pruebas {

	// Desarrolllar los m�todos del examen AQUI (ver Objetivos)
	
	private Examen[] objetos = new Examen[5];
	
	

	public static void main(String[] args) {
		// Hacer las llamadas a los m�todos AQUI.
		// (no olvidar recoger los valores devueltos
		
		
		Pruebas ejercicios= new Pruebas();
		Examen objeto1 = new Examen(7,"Matematicas",'M',false);
		Examen objeto2 = new Examen(4,"Lengua",'F',true);
		Examen [] resultado = {objeto1 , objeto2};
		ejercicios.objetos = resultado;
		
	}
	
	
	
	
	
	
	
}
