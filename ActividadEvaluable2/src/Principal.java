import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		ArrayList<Programador> listaProgramador = new ArrayList<Programador>();
		
		Programador p = new Programador(null, null, null, 0, false, 0, 0, null);
		listaProgramador.add(p);
		
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch (opcion) {
			case 1: System.out.println("Dime tu nombre: ");
					String nombre = sc.next();
					System.out.println("Dime tu dni: ");
					String dni = sc.next();
					System.out.println("Dime tu edad: ");
					int edad = sc.nextInt();
					System.out.println("Casado");
					boolean casado = sc.nextBoolean();
					System.out.println("Dime tu edad: ");
					double salario = sc.nextDouble();
			}
		
		} while (opcion!=4);
		
		
	}

		public static void mostrarMenu() {
			System.out.println("Menu de opciones");
			System.out.println("1. Dar alta Programador");
			System.out.println("2. Dar baja Programador");
			System.out.println("3. Aumentar salario de un Programador");
			System.out.println("4. Salir");
	}

}
