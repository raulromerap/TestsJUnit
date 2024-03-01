package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Numeros;

class NumerosTest {

	@ParameterizedTest
	@MethodSource("capicua")
	void testEsCapicua(boolean capicua, int numero) {
		Numeros num = new Numeros(numero);
		boolean esCap = num.esCapicua();
		assertEquals(capicua, esCap);
	}
	
	private static Stream<Arguments> capicua(){
		
		return Stream.of(
				
				Arguments.of(true, 1221),
				Arguments.of(false, 1231),
				Arguments.of(false, -2222)
				
		);
		
	}

}
