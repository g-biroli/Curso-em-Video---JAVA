package ejemplosHerencia;

public class Principal {

	public static void main(String[] args) {
			
		Persona p = new Persona(null, null);
		System.out.println("Tu dni es: " +p.getDni());
		p.setDni("4328J");
		System.out.println("Tu dni ahora es: "+p.getDni());
		System.out.println("Tu dni ahora es: "+p.getDni());
	

	}

}
