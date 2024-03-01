import java.sql.Date;

public class Equipo {
	
	String Nombre, dni;
	int edad, dificultad;
	double puntuacion;
	
	public Equipo( String nombre, String dni, int edad, double pontuacion, int dificultad) {
		this.Nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.puntuacion = puntuacion;
		this.dificultad = dificultad;
	}
	
	protected String getNombre() {
		return Nombre;
	}
	protected void setNombre(String nombre) {
		Nombre = nombre;
	}
	protected String getDni() {
		return dni;
	}
	protected void setDni(String dni) {
		this.dni = dni;
	}
	protected double getPontuacion() {
		return puntuacion;
	}
	protected void setPontuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	protected int getDificultad() {
		return dificultad;
	}
	protected void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
