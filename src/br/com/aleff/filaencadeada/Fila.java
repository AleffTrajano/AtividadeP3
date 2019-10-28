package br.com.aleff.filaencadeada;

public class Fila {
	
	private No primeiroElemento;
	private static int tamanho;
	
	public void enqueue(No no) {
		if (no == null) {
			throw new IllegalArgumentException();
		}
		
		if (this.isEmpty()) {
			this.primeiroElemento = no;
		
		} else {
			No temp = this.primeiroElemento;
		
			while (temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			
			temp.setProximo(no);
			temp = null;
		}
		
		this.tamanho++;
	}
	
	public void dequeue() throws FilaEmptyException {
		if (this.isEmpty()) {
			throw new FilaEmptyException();
		}
		No temp = this.primeiroElemento;
		this.primeiroElemento = this.primeiroElemento.getProximo();
		temp.setProximo(null);
		temp = null;
		this.tamanho--;
	}
	
	public No getfront() throws FilaEmptyException {
		if (this.isEmpty()) {
			throw new FilaEmptyException();
		}
		
		return this.primeiroElemento;
	}
	
	public int size() {
		return this.tamanho;
	}
	
	public static boolean isEmpty() {
		return tamanho == 0;
	}

}

