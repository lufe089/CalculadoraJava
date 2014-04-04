package edu.javerianacali.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalcularTest {


	
	@Test
	public void sumarTest(){
		Calculadora calculadora= new CalculadoraImpl();
		assertEquals(calculadora.sumar(1, 1), 0);
	}

}
