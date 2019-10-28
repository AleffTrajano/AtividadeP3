package br.com.aleff.pilhaencadeada;


public class Pilha {
	
	
	private No primeiroElemento;
	private int tamanho;
	
	
	
	public int size() {
		return this.tamanho;
	}
	
	public boolean isEmpty() {
		return this.tamanho == 0;
	}
	
	public No top() throws PilhaEmptyException {
		if (isEmpty()) {
			throw new PilhaEmptyException();
		}
		
		No top = this.primeiroElemento;
		
		while (top.getProximo() != null) {
			top = top.getProximo();
		}
		
		return top;
	}
	
	
	public void push(No node) {
		if (node == null) {
			throw new IllegalArgumentException();
		}
		
		if (this.isEmpty()) {
			this.primeiroElemento = node;
		} else {
			No temp = this.primeiroElemento;
			
			while (temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			
			temp.setProximo(node);
			temp = null;
		}
		
		this.tamanho++;
	}
	
	public No pop() throws PilhaEmptyException {
		No remover = this.pop();
		
		if (this.tamanho > 1) {
			No temp = this.primeiroElemento;
			
			while (temp.getProximo().getProximo() != null) {
				temp = temp.getProximo();
			}
			
			temp.setProximo(null);
			temp = null;
		}
		
		this.tamanho--;
		
		return remover;
	}
	
	

	
	
}



