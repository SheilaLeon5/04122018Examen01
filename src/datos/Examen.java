package datos;

public class Examen {
	// Objetivos 1 y 2
	
	private int numExam;
	private String asignatura;
	private char sexoAlumn;  // 'F' -> femenino / 'M' -> Masculino
	private boolean aprobado; //'true' -> Aprobado , 'falso' -> No aprobado
	
	

	public Examen() {
		super();
		this.numExam = 14;
		this.asignatura = "lenguaje";
		this.sexoAlumn = 'F';
		this.aprobado = true;
		
	}
	public Examen(int numExam, String asignatura, char sexoAlumn, boolean aprobado, int[][] notasAlumnos,String[] alumnos, String[] modulos) {
		super();
		this.numExam = numExam;
		this.asignatura = asignatura;
		this.sexoAlumn = sexoAlumn;
		this.aprobado = aprobado;

	}
	
	
	
	public int getNumExam() {
		return numExam;
	}
	public void setNumExam(int numExam) {
		this.numExam = numExam;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public char getSexoAlumn() {
		return sexoAlumn;
	}
	public void setSexoAlumn(char sexoAlumn) {
		this.sexoAlumn = sexoAlumn;
	}
	public boolean isAprobado() {
		return aprobado;
	}
	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}




	private int[][] notasAlumnos = { { 5, 6, 3, 9, 8 }, { 7, 2, 8, 4, 5 }, { 8, 5, 6, 2, 4 } };
	private String[] alumnos = { "Pepe", "Manuel", "Carlos" };
	private String[] modulos = { "PRO", "SSF", "LND", "LNT", "FOL" };
	
	
	
}
