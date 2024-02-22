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
	void testEsCapicua(int copiaNum, int numReves, boolean capicua, int numero) {
		Numeros num = new Numeros(numero);
		boolean esCap = num.esCapicua();
		assertEquals(capicua, esCap);
	}
	
	private static Stream<Arguments> capicua(){
		
		return Stream.of(
				
				Arguments.of(1221, 1221, true, 1221),
				Arguments.of(1231, 1321, false, 1231),
				Arguments.of(-2222, -2222, false, -2222)
				
		);
		
	}

}
