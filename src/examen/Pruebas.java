package examen;

import java.util.Arrays;

import datos.Examen;

public class Pruebas {

	// Desarrolllar los métodos del examen AQUI (ver Objetivos)
	
	//Objetivo 2.
	private Examen[] objetos = new Examen[5];   
	
	
	/*     --MEJORA OBJETIVO 2.2--
	 * Objetivo 2.2 añadir los dos objetos anteriores a un array de esa clase,
	 *  de 5 elementos de tamaño.
	 *  
	 * --- >    Examen[] miArray = {objeto1,objeto2,null,null,null}
	 * 
	 *   Yo hice: 
	 *    private Examen[] objetos = new Examen[5]; 
	 *    Examen objeto1 = new Examen(7,"Matematicas",'M',false);
	 *	  Examen objeto2 = new Examen(4,"Lengua",'F',true);
	 *	  Examen [] resultado = {objeto1 , objeto2};
	 *	  ejercicios.objetos = resultado;
	 * 
	 */


	//Objetivo 4.  
		//Este método devuelve n objetos del array ya creado por tanto si el array principal tiene 4 objetos no podremos mostrar 5
	public Examen[] creaObjetosExamen(int n){
		Examen[] resultado = new Examen[n];
			if(n > objetos.length) {
				int i = 0;
				while(i < objetos.length) {
					resultado[i] = objetos[i]; // Otra posibilidad: Quitar el incremento de i y ponerlo en 'resultado[i++]'
					i++;
				}	
			}else {
				int i = 0;
				while(i < n) {
					resultado[i] = objetos[i];
					i++;
				}
			}
			return resultado;
	}
	
	
	

	
	// Objetivo 3.
	public int productoDosNumeros (int a, int b) {
		int resultado = 0;
		for (int i = 0; i < b; i++) {
			resultado =+ a + resultado; // Mejor sin la variable resultado. Es decir --> resultado =+ a;
		}
		//System.out.println(resultado);
		return resultado;
		
	}
	
	//Objetivo 5.
	private Examen[] alumnos;
	public void notaMediasAlumnos() {
		
		Examen examen = new Examen();
		int[][] notas = examen.getNotasAlumnos();
		String[] alumnos = examen.getAlumnos();
		int numModulos = examen.getModulos().length;

		for (int i = 0; i < alumnos.length; i++) {
			int acumulado = 0;
			for (int j = i; j < notas[0].length; j++) { // número de la primera fila 
				acumulado += notas[i][j];
			}
			//System.out.println("Nota media de " + alumnos[i] + " --> " + acumulado/numModulos);
		}
	}
	
	
	
	//Objetivo 6.
		public void notaMediaModulos() {
			Examen examen = new Examen();
			int[][] notas = examen.getNotasAlumnos();
			String[] modulos = examen.getModulos();

			for (int j = 0; j < notas[0].length; j++) {
				int acumulado = 0;
				for (int i = 0; i < notas.length; i++) { // número de la primera fila 
					acumulado += notas[i][j];
				}
				System.out.println("Nota media de " + modulos[j] + " es: " + acumulado / notas.length );
			}
		}
	


	public static void main(String[] args) {
		// Hacer las llamadas a los métodos AQUI.
		// (no olvidar recoger los valores devueltos
		
		Pruebas ejercicios= new Pruebas();

		//Objetivo 2.

		Examen objeto1 = new Examen(7,"Matematicas",'M',false);
		Examen objeto2 = new Examen(4,"Lengua",'F',true);
		Examen [] resultado = {objeto1 , objeto2};
		ejercicios.objetos = resultado;
		
		//Objetivo 3.
		int a = 6;
		int b = 4;
		ejercicios.productoDosNumeros(a,b);
		
		//Objetivo 4.
		 Examen [] examenes = ejercicios.creaObjetosExamen(4);  // mejor recoger resultados. Es decir --> Examen[] examenes
		
		//Objetivo 5.
		ejercicios.notaMediasAlumnos();	
		
		//Objetivo 6.
		ejercicios.notaMediaModulos();
	
		
	}
	
	
	
	
	
	
	
}
