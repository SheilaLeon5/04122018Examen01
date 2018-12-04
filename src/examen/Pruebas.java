package examen;

import datos.Examen;

public class Pruebas {

	// Desarrolllar los métodos del examen AQUI (ver Objetivos)
	
	//Objetivo 2.
	private Examen[] objetos = new Examen[5];
	
	
	// Objetivo 3.
	public int productoDosNumeros (int a, int b) {
		int resultado = 0;
		for (int i = 0; i < b; i++) {
			resultado =+ a + resultado; 
		}
		//System.out.println(resultado);
		return resultado;
		
	}
	
	
	

	public static void main(String[] args) {
		// Hacer las llamadas a los métodos AQUI.
		// (no olvidar recoger los valores devueltos
		
		Pruebas ejercicios= new Pruebas();

		
		//Objetivo 1.
		int a = 4;
		int b = 7;
		ejercicios.productoDosNumeros(a,b);
		
	
		
		//Objetivo 2.
		Examen objeto1 = new Examen(7,"Matematicas",'M',false);
		Examen objeto2 = new Examen(4,"Lengua",'F',true);
		Examen [] resultado = {objeto1 , objeto2};
		ejercicios.objetos = resultado;
		
	}
	
	
	
	
	
	
	
}
