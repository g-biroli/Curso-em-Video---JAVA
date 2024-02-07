package AlquillerC;

import static org.junit.jupiter.api.Assertions.*;

import java.security.PublicKey;
import java.util.AbstractSequentialList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.platform.commons.annotation.Testable;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.parameterized.*;

@RunWith (Parameterized.class)

public class TestReserva {
	
	private int PrecioDiario;		//Esses atributos nao recebem nenhum valor, apenas desmonstra as variaveis que usara no exercicio
	private int Descuento;
	private int NumeroDias;
	private int PrecioTotal;
	
public TestReserva (int PrecioDiario, int Descuento, int NumeroDias, int PrecioTotal) {
	
	this.PrecioDiario= PrecioDiario;
	this.Descuento= Descuento; 			//Criando as variaveis de cada ATRIBUTO. Se cria as variaveis dos atributos acima, agora se pode usar
	this.NumeroDias= NumeroDias;		// a variavel para fazer o teste
	this.PrecioTotal= PrecioTotal;
}
@Parameters
public static Collection<Object[]> datos(){
	
	return Arrays.asList(new Object[][] {
	{12,34,5,26}, {12,34,-5,-1}, {3,3,1,8}
	}
	);
}
Publi void TestReservarCoche() {
	
	AlquilerCoches reserva= new AlquilerCoches(PrecioDiario, Descuento);
	
	int precio= reserva.ReservarCoche(int NumeroDias) ;
	
	asserEquals("Error",PrecioTotal , precio);

}

