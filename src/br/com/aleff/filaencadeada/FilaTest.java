package br.com.aleff.filaencadeada;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FilaTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void isEmptyTest() {
		Fila fila = new Fila();
		
		Assert.assertTrue(Fila.isEmpty());
	}
	
	@Test
	public void enqueueTest() throws FilaEmptyException {
		Fila fila = new Fila();
		fila.enqueue(new No("A"));
		
		Assert.assertEquals("A", fila.getfront().getValor());
		Assert.assertEquals(1, fila.size());
		Assert.assertFalse(fila.isEmpty());
	}
	
	@Test
	public void dequeueTest() throws FilaEmptyException {
		Fila fila = new Fila();
		fila.enqueue(new No("A"));
		fila.dequeue();
		
		Assert.assertEquals(0, fila.size());
		Assert.assertTrue(fila.isEmpty());
	}
	
	@Test
	public void getfrontTest() throws FilaEmptyException {
		Fila fila = new Fila();
		fila.enqueue(new No("A"));
		
		Assert.assertEquals("A", fila.getfront().getValor());
	}
	
	
	

}
