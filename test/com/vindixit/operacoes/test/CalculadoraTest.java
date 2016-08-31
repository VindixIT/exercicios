package com.vindixit.operacoes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vindixit.operacoes.Calculadora;

public class CalculadoraTest {

	@Test
	public void testAdicionar() {
		Calculadora calculadora = new Calculadora();
		int actual = calculadora.adicionar(2, 3);
		assertEquals(5, actual);

	}

	@Test
	public void testSubtrair() {
		Calculadora calculadora = new Calculadora();
		int actual = calculadora.subtrair(5, 2);
		assertEquals(3,actual);		
	}
	
	@Test
	public void testDividir() {
		Calculadora calculadora = new Calculadora();
		double actual = calculadora.dividir(10, 2);
		assertEquals(5, actual, 0.0);
			
	}
	
	@Test
	public void testMultiplicar() {
		Calculadora calculadora = new Calculadora();
		int actual = calculadora.multiplicar(4, 5);
		assertEquals(20,actual);	
	}
	
	}
