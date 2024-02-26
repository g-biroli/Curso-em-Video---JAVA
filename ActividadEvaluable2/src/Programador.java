
public class Programador extends Empleado {		//herencia del Empleado
	int lineasDeCodigoPorHora;					// nuevos atributos
	String lenguajeDominante;
	
	protected Programador(String nombre, String apellido, String dni, int edad, boolean casado, double salario,
			int lineasDeCodigoPorHora, String lenguajeDominante) {
		super(nombre, apellido, dni, edad, casado, salario);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}

	public int getLineasDeCodigoPorHora() {
		return lineasDeCodigoPorHora;
	}
	
	public  int setLineasDeCodigoPorHora (int lineasDeCodigoPorHora) {
		return this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;		//no se se esta bien este
	}
	public String getLenguajeDominante() {
		return lenguajeDominante;
	}
}
