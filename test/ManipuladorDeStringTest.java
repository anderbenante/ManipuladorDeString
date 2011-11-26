import static org.junit.Assert.*;

import org.junit.Test;


public class ManipuladorDeStringTest {

	@Test
	public void deveOrdenarFraseCrescente() {
		String fraseCrescente = Manipulador.ordemCrescente("O rato roeu a roupa do rei de Roma");
		assertEquals("O a do de rei rato roeu roma roupa",fraseCrescente );	/*O a do de rei rato roeu roma roupa*/
	}
	
	@Test
	public void deveOrdenarFraseCrescenteJabuti() {
		String fraseCrescente = Manipulador.ordemCrescente("Um pequeno jabuti xereta viu dez cegonhas felizes.");
		assertEquals("Um viu dez jabuti xereta pequeno felizes cegonha",fraseCrescente );	
	}

}
