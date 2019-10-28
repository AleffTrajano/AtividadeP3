package br.com.aleff.pilhaSequecial;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PilhaTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void isEmptyTest() {
		Pilha<String> stack = new Pilha<>();
		
		Assert.assertTrue(stack.isEmpty());
	}
	
	@Test
	public void popTest() throws PilhaEmptyException {
		Pilha<String> pilha = new Pilha<>();
		pilha.push("Aleff");
		
		Assert.assertEquals("Aleff", pilha.pop());
		Assert.assertEquals(0, pilha.size());
	}
	
	@Test
	public void pushTest() throws PilhaEmptyException {
		Pilha<String> pilha = new Pilha<>();
		pilha.push("A");
		
		Assert.assertEquals("A", pilha.top());
		Assert.assertEquals(1, pilha.size());
	}

}
