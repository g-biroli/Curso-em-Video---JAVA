
public class Programador extends Empleado {		//herencia del Empleado
	int lineasDeCodigoPorHora;					// nuevos atributos
	String lenguajeDominanteString;
	
	protected Programador (String nombre, String apellido, String dni, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante) {
		super(nombre, apellido, dni, edad, casado, salario);		//constructor con la herencia y todo
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominanteString = lenguajeDominante;
	}
}
