package br.com.aleff.filaSequencial;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Queue;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FilaTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	/*
	@Test
	public void insertTest1() {
		Queue<String> fila = new Fila<>();
		((Fila) fila).insert("A");
		Assert.assertEquals(1, fila.size());
	}
	*/
	
	@Test
	public void insertTest2() {
		Fila<String> queue = new Fila<>();
		
		Assert.assertEquals(2, queue.tamanho());
	}
	
	
	
	@Test
	public void removeTest1() throws QueueEmptyException {
		Fila<String> fila = new Fila<>();
		fila.insert("A");
		
		Assert.assertEquals("A", fila.remove());
		Assert.assertEquals(0, fila.tamanho());
	}
	
	@Test
	public void removeTest2() throws QueueEmptyException {
		Fila<String> fila = new Fila<>();
		
		Assert.assertEquals("A", fila.remove());
		Assert.assertEquals(1, fila.tamanho());
	}
	
	
	
	@Test
	public void frontTest1() throws QueueEmptyException {
		Fila<String> fila = new Fila<>();
		fila.insert("A");
		
		Assert.assertEquals("A", fila.front());
	}
	
	@Test
	public void frontTest2() throws QueueEmptyException {
		Fila<String> fila = new Fila<>();
		fila.insert("A");
		fila.insert("B");
		fila.remove();
		
		Assert.assertEquals("B", fila.front());
	}
	
	@Test
	public void frontTest3() throws QueueEmptyException {
		Fila<String> fila = new Fila<>();
		fila.front();
	}
}



