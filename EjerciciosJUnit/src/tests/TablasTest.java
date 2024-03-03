package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Tablas;

class TablasTest {

	@ParameterizedTest
	@MethodSource("magico")
	void testEsMagica(int[][] tabla) {
		boolean resultado = Tablas.esMagica(tabla);
		if(resultado) {
			assertTrue(resultado);
		}else {
			assertFalse(resultado);
		}
	}

	@ParameterizedTest
	@MethodSource("tablas")
	void testGira90(int[][] tablaInicio, int[][] expected) {
		int[][] resultado = Tablas.gira90(tablaInicio);
		assertArrayEquals(expected, resultado);
	}
	
	private static Stream<int[][]> magico(){
		
		return Stream.of(
				
				new int[][] {{0, 0}, {0, 0}},
				new int[][] {{1, 0}, {1, 0}},
				new int[][] {{0}, {1}},
				new int[][] {{}, {}}
				
		);
		
	}

	 public static Stream<Object[]> tablas() {
	        return Stream.of(
	                new Object[][]{
	                        {new int[][]{{1, 2}, {3, 4}}, new int[][]{{3, 1}, {4, 2}}},
	                        {new int[][]{{1}}, new int[][]{{1}}},
	                        {new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}}
	                }
	        );
	    }
}
