package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import clases.FuncionesRecursivas;

class FuncionesRecursivasTest {

	@ParameterizedTest
	@MethodSource("suma")
	void testSumatorio(int numero, int expected) {
		int resultado = FuncionesRecursivas.sumatorio(numero);
		assertEquals(expected, resultado);
	}

	@ParameterizedTest
	@MethodSource("potencia")
	void testPotencia(double a, int n, double expected) {
		double resultado = FuncionesRecursivas.potencia(a, n);
		assertEquals(expected, resultado);
	}

	@ParameterizedTest
	@MethodSource("fibo")
	void testFibonacci(int numero, int expected) {
		int resultado = FuncionesRecursivas.fibonacci(numero);
		assertEquals(expected, resultado);
	}
	
	private static Stream<Arguments> suma(){
		
		return Stream.of(
				
			Arguments.of(1, 1),
			Arguments.of(3, 6),
			Arguments.of(50, 1275)
				
		);
		
	}
	
	private static Stream<Arguments> potencia(){
		
		return Stream.of(
				
			Arguments.of(20.4, 2, 416.15999999999997),
			Arguments.of(3.9, 0, 1),
			Arguments.of(50.4, 1, 50.4)
				
		);
		
	}
	
	private static Stream<Arguments> fibo(){
		
		return Stream.of(
				
			Arguments.of(7, 13),
			Arguments.of(1, 1),
			Arguments.of(2, 1)
				
		);
		
	}

}
