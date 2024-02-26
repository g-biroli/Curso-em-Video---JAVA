
public class Empleado {
	protected String nombre, apellido, dni;		//Atributos
	protected int edad;
	protected boolean casado; //duvida no metodo desse(nao sei qual metodo usar)
	protected double salario;
	
	 public Empleado(String nombre, String apellido, String dni, int edad, boolean casado, double salario) {
		 this.nombre = nombre;					// hacendo el constructor del Empleado
		 this.apellido = apellido;	
		 this.dni = dni;
		 this.edad = edad;
		 this.casado = casado;
		 this.salario = salario;
	 }
	 
	 public String getNombre() {				//metodos del empleado
		 return nombre;
	 }
	 
	 public void setNombre (String nombre) {
		 this.nombre = nombre;
	 }
	 
	 public String getApellido () {
		 return apellido;
	 }
	 
	 public void setApellido (String apellido) {
		 this.apellido = apellido;
	 }
	 
	 public String getDni() {
		 return dni;
	 }
	 
	 public void setDni(String dni) {
		 this.dni = dni;
	 }
	 
	 public int getEdad () {
		 return edad;
	 }
	 
	 public void setEdad(int edad) {
		 this.edad = edad;
	 }
	 
	 public double getSalario() {
		 return salario;
	 }
	 
	 public void setSalario(double salario) {
		 this.salario = salario;
	 }
	 
	 // duvida se no enunciado da tarefa "metodo da idade, se for menor ou 21 principiante, maior q 22 e menor q 35
	 // intermedio. A duvida é se esse metodo eu faco na propria aba do empleado ou no principal.
	 // nao sei qual o metodo do BOOLEAN, na minha cabeca nao faz sentido ser getBoolean e setBoolean. Ver na aula.
	 
	 
}