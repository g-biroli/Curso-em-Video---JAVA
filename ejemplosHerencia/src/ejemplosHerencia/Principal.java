package ejemplosHerencia;

public class Principal {

	public static void main(String[] args) {
			
		Persona p = new Persona(null, null);
		System.out.println("Tu dni es: " +p.getDni());
		p.setDni("4328J");
		System.out.println("Tu dni ahora es: "+p.getDni());
		
		Persona p1 = new Persona("987", "Gabriel");
		System.out.println("Tu dni es: "+p1.getDni());
		
		Alumna a = new Alumna("875967J", "Beto", "00000");
		System.out.println("Tu dni es: "+a.getDni());
		System.out.println("Tu nombre es: "+a.getNombre());
		System.out.println("Tu expediente es: "+a.getNumExp());
		
		Profesor pr = new Profesor("sdr", "Luigi", 5879.90);
	}

}
