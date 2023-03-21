package org.argentinaprograma.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalculadoraTest extends Calculadora {


	@Test
	public void testMultiplicar() {
	    Calculadora calculator = new Calculadora();
	    double a = 80;
	    double b = 3;
	    
	    double resultado_real = calculator.multiplicar(a, b);
	 
	    double resultado_esperado = 240;
	   
	    assertEquals("Test 'El resultado de multiplicar 80 por 3 da 240.'", resultado_esperado, resultado_real, 0.0001);
	    
	}
	
	@Test
	public void testSumaryDespuesDividir() {
		
	    Calculadora calculator = new Calculadora();
	    double a = 150;
	    double b = 180;
	    
	    double resultado_temp = calculator.sumar(a, b);
	    
	    double c = 3;
	    
	    double resultado_real = calculator.dividir(resultado_temp, c);
	 
	    double resultado_esperado = 110;
	 
	    assertEquals("Test 'El resultado de sumar 150 y 180, dividido por 3, da 110.' ", resultado_esperado, resultado_real, 0.0001);
	    
	}

	@Test
	public void testRestaryDespuesMultiplicar() {
		
	    Calculadora calculator = new Calculadora();
	    double a = 90;
	    double b = 50;
	    
	    double resultado_temp = calculator.restar(a, b);
	    
	    double c = 15;
	    
	    double resultado_real = calculator.multiplicar(resultado_temp, c);
	 
	    double resultado_no_esperado = 605;
	 
	    assertNotEquals("Test 'El resultado de restar 90 y 50, multiplicado por 15, no da 605.' ",resultado_no_esperado, resultado_real, 0.001);
	}
	
	@Test
	public void testSumaryDespuesMultiplicar() {
		
	    Calculadora calculator = new Calculadora();
	    double a = 70;
	    double b = 40;
	    
	    double resultado_temp = calculator.sumar(a, b);
	    
	    double c = 25;
	    
	    double resultado_real = calculator.multiplicar(resultado_temp, c);
	 
	    double resultado_no_esperado = 2700;
	 
	    assertNotEquals("Test 'El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.' ",resultado_no_esperado, resultado_real, 0.001);
	}
	
}
