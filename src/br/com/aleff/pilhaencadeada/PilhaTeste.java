package br.com.aleff.pilhaencadeada;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



class PilhaTeste {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void pushTest() throws PilhaEmptyException {
		Pilha pilha = new Pilha();
		pilha.push(new No("A"));
		
		Assert.assertEquals("A", pilha.top().getValor());
		Assert.assertEquals(1, pilha.size());
		Assert.assertFalse(pilha.isEmpty());
	}
	
	@Test
	public void popTest1() throws PilhaEmptyException {
		Pilha pilha = new Pilha();
		pilha.push(new No("A"));
		Assert.assertEquals("A", pilha.pop().getValor());
		Assert.assertEquals(0, pilha.size());
		Assert.assertTrue(pilha.isEmpty());
	}
	
	@Test
	public void popTest2() throws PilhaEmptyException {
		Pilha pilha = new Pilha();
		pilha.push(new No("Aleff"));
		pilha.push(new No("Diego"));

		Assert.assertEquals("Diego", pilha.pop().getValor());
		Assert.assertEquals("Aleff", pilha.top().getValor());
		Assert.assertEquals(1, pilha.size());
		Assert.assertFalse(pilha.isEmpty());
	}
	
	@Test
	public void topTest1() throws PilhaEmptyException {
		Pilha pilha = new Pilha();
		pilha.push(new No("Aleff"));
		
		Assert.assertEquals("Aleff", pilha.top().getValor());
		Assert.assertEquals(1, pilha.size());
		Assert.assertFalse(pilha.isEmpty());
	}
	
	@Test
	public void topTest2() throws PilhaEmptyException {
		Pilha pilha = new Pilha();
		pilha.push(new No("Aleff"));
		pilha.push(new No("Diego"));
		
		Assert.assertEquals("Diego", pilha.top().getValor());
		Assert.assertEquals(2, pilha.size());
		Assert.assertFalse(pilha.isEmpty());
	}
	
	
	@Test
	public void isEmptyTest1() {
		Pilha pilha = new Pilha();
		Assert.assertTrue(pilha.isEmpty());
	}
	
	
	@Test
	public void sizeTest1() {
		Pilha pilha = new Pilha();
		
		Assert.assertEquals(0, pilha.size());
	}

}

	
