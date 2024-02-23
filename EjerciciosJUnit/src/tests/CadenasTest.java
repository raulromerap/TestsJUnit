package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Cadenas;

class CadenasTest {

	@ParameterizedTest
	@MethodSource("espacios")
	void testCuentaEspacios(String frase, int expected) {
		Cadenas cad = new Cadenas(frase);
		int resultado = cad.cuentaEspacios();
		assertEquals(expected, resultado);
	}

	@ParameterizedTest
	@MethodSource("reves")
	void testDelReves(String frase, String expected) {
		Cadenas cad = new Cadenas(frase);
		String resultado = cad.delReves();
		assertEquals(expected, resultado);
	}

	@Test
	void testContarPalabra() {
		fail("Not yet implemented");
	}

	private static Stream<Arguments> espacios() {

		return Stream.of(

				Arguments.of("Le voy a pegar a Lorenzo", 5), 
				Arguments.of("Chicken", 0), 
				Arguments.of("C", 0),
				Arguments.of("", 0)

		);

	}

	private static Stream<Arguments> reves(){
		
		return Stream.of(
				
				Arguments.of("Le voy a pegar a Lorenzo", "ozneroL a ragep yov eL"),
				Arguments.of("Chicken", "nekcihC"),
				Arguments.of("C", "C"),
				Arguments.of("", "")
				
		);
	}
}
