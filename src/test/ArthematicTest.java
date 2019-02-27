package test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import practice.Arthematic;
import practice.Soham;

public class ArthematicTest {
	
	@Mock
    Soham soham;
	
	Arthematic arth;
	
	@Before
	public void abc() {
		arth = new Arthematic();
		soham = Mockito.mock(Soham.class);
		when(soham.getName()).thenReturn("sohamkr");
	}

	@Test
	public void testSum() {
		assertEquals(5,arth.sum(2, 3));
	}
	
	@Test
	public void testSubstract() {
		assertEquals(5,arth.substract(10, 5));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(5,arth.multiply(5, 1));
	}
	
	@Test
	public void testDivide() {
		assertEquals(2,arth.divide(10, 5));
	}
	
	@Test
	public void testSquare() {
		assertEquals(49,arth.square(7));
	}
	
	@Test
	public void testSoham() {
		assertEquals("sohamkr",arth.name(soham));
		
	}
	
	

}
