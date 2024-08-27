package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Teste 5 + 5 = 10")
	void testSum() {
		// Arrange
		Calculadora cal = new Calculadora();
		
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		double resultado = cal.sum(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, " 5 + 5 não gerou o valor 10");
	}
	
	@Test
	@DisplayName("Teste 7 - 5 = 2")
	void testSub() {
		// Arrange
		Calculadora cal = new Calculadora();
		
		double valor1 = 7D;
		double valor2 = 5D;
		double esperado = 2D;
		
		double resultado = cal.sub(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, " 7 - 5 não gerou o valor 2");
	}
	@Test
	@DisplayName("Teste 4 * 5 = 20")
	void testMult() {
		// Arrange
		Calculadora cal = new Calculadora();
		
		double valor1 = 4D;
		double valor2 = 5D;
		double esperado = 20D;
		
		double resultado = cal.mult(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, " 4 * 5 não gerou o valor 20");
	}
	@Test
	@DisplayName("Teste 4 / 2 = 2")
	void testDiv() {
		// Arrange
		Calculadora cal = new Calculadora();
		
		double valor1 = 4D;
		double valor2 = 2D;
		double esperado = 2D;
		
		double resultado = cal.div(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, " 4 / 2 não gerou o valor 2");
	}

}
