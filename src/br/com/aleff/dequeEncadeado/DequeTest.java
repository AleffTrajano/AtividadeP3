package br.com.aleff.dequeEncadeado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DequeTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void constructorTest1() {
		Deque deque = new Deque();
		Assert.assertEquals(0, deque.getSize());
		Assert.assertNull(deque.getFirst());
	}
	
	@Test
	public void constructorTest2() {
		Deque deque = new Deque(new Trem("A"));
		Assert.assertEquals(1, deque.getSize());
		Assert.assertEquals("A", deque.getFirst().getVagao());
	}
	
	
	@Test
	public void insertFirstTest1() {
		Deque deque = new Deque();
		deque.inserirFront(new Trem("A"));
		Assert.assertEquals("A", deque.getFirst().getVagao());
		Assert.assertEquals("A", deque.getLast().getVagao());
		Assert.assertNull(deque.getLast().getProximo());
		Assert.assertEquals(1, deque.getSize());
	}
	
	
	@Test
	public void removeFirstTest1() throws DequeEmptyException {
		Deque deque = new Deque();
		deque.inserirFront(new Trem("A"));
		deque.removeLast();
		Assert.assertNull(deque.getFirst());
		Assert.assertEquals(0, deque.getSize());
	}
	

	@Test
	public void insertLastTest1() {
		Deque deque = new Deque();
		deque.insertLast(new Trem("A"));
		Assert.assertEquals("A", deque.getFirst().getVagao());
		Assert.assertEquals("A", deque.getLast().getVagao());
		Assert.assertNull(deque.getLast().getProximo());
		Assert.assertEquals(1, deque.getSize());
	}
	
	@Test
	public void insertLastTest2() {
		Deque deque = new Deque();
		deque.insertLast(new Trem("A"));
		deque.insertLast(new Trem("B"));
		Assert.assertEquals("A", deque.getFirst().getVagao());
		Assert.assertEquals("B", deque.getLast().getVagao());
		Assert.assertNull(deque.getLast().getProximo());
		Assert.assertEquals(2, deque.getSize());
	}
	
	
	
	@Test
	public void removeLastTest1() throws DequeEmptyException {
		Deque deque = new Deque();
		deque.inserirFront(new Trem("A"));
		deque.removeLast();
		Assert.assertNull(deque.getFirst());
		Assert.assertEquals(0, deque.getSize());
	}
	
	@Test
	public void removeLastTest2() throws DequeEmptyException {
		Deque deque = new Deque();
		deque.inserirFront(new Trem("A"));
		deque.removeLast();
		Assert.assertEquals("A", deque.getFirst().getVagao());
		Assert.assertEquals("A", deque.getLast().getVagao());
		Assert.assertEquals(1, deque.getSize());
	}
	
	
	
}



