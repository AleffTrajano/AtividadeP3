package br.com.aleff.dequeSequencial;

import org.junit.Assert;
import org.junit.Test;

import br.com.aleff.dequeEncadeado.DequeEmptyException;

public class DequeTest {

	@Test
	public void insertFirstTest1() throws DequeEmptyException, DequeEmptyException {
		Deque<String> deque = new Deque<>();
		deque.insertFirst("A");
		Assert.assertEquals("A", deque.first());
		Assert.assertEquals("A", deque.last());
		Assert.assertEquals(1, deque.size());
	}

	@Test
	public void insertFirstTest2() throws DequeEmptyException {
		Deque<String> deque = new Deque<>();
		deque.insertFirst("A");
		deque.insertFirst("B");
		Assert.assertEquals("B", deque.first());
		Assert.assertEquals("A", deque.last());
		Assert.assertEquals(2, deque.size());
	}


	@Test(expected = IllegalArgumentException.class)
	public void insertFirstTest4() {
		Deque<String> deque = new Deque<>();
		deque.insertFirst(null);
	}

	@Test
	public void insertLastTest1() throws DequeEmptyException {
		Deque<String> deque = new Deque<>();
		deque.insertLast("A");
		Assert.assertEquals("A", deque.first());
		Assert.assertEquals("A", deque.last());
		Assert.assertEquals(1, deque.size());
	}
	
	@Test
	public void insertLastTest2() throws DequeEmptyException {
		Deque<String> deque = new Deque<>();
		deque.insertLast("A");
		deque.insertLast("B");
		Assert.assertEquals("A", deque.first());
		Assert.assertEquals("B", deque.last());
		Assert.assertEquals(2, deque.size());
	}
	
	
	@Test
	public void removeFirstTest1() throws DequeEmptyException {
		Deque<String> deque = new Deque<>();
		deque.insertFirst("A");
		deque.removeFirst();
		Assert.assertEquals(0, deque.size());
	}
	
	@Test
	public void removeFirstTest2() throws DequeEmptyException {
		Deque<String> deque = new Deque<>();
		deque.insertFirst("A");
		deque.insertLast("B");
		deque.removeFirst();
		Assert.assertEquals("B", deque.first());
		Assert.assertEquals("B", deque.last());
		Assert.assertEquals(1, deque.size());
	}
	
	
	
	@Test(expected = DequeEmptyException.class)
	public void removeFirstTest4() throws DequeEmptyException {
		Deque<String> deque = new Deque<>();
		deque.removeFirst();
	}
	
	@Test
	public void removeLastTest1() throws DequeEmptyException {
		Deque<String> deque = new Deque<>();
		deque.insertFirst("A");
		deque.removeLast();
		Assert.assertEquals(0, deque.size());
	}
	
	@Test
	public void removeLastTest2() throws DequeEmptyException {
		Deque<String> deque = new Deque<>();
		deque.insertFirst("A");
		deque.insertLast("B");
		deque.removeLast();
		Assert.assertEquals("A", deque.first());
		Assert.assertEquals("A", deque.last());
		Assert.assertEquals(1, deque.size());
	}
	
}