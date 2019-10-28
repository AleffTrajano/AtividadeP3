package br.com.aleff.pilhaSequecial;

public class Pilha <Livros> {
	
	private final int TAMANHO_iNICIAL = 3;
	private Livros[] array = (Livros[]) new Object[TAMANHO_iNICIAL];	
	private int tamanho;
	
	public int size() {
		return this.tamanho;
	}
	
	public boolean isEmpty() {
		return this.tamanho == 0;
	}
	
	public Livros top() throws PilhaEmptyException {
		if (this.isEmpty()) {
			throw new PilhaEmptyException();
		}
		
		return this.array[this.tamanho - 1];
	}
	
	public Livros pop() throws PilhaEmptyException {
		if(this.isEmpty()) {
			throw new PilhaEmptyException();
		}
		
		Livros remover = this.array[this.tamanho - 1];
		this.array[this.tamanho - 1] = null;
		this.tamanho--;
		return remover;
	}
	
	public void push(Livros element) {
		if (element == null) {
			throw new IllegalArgumentException();
		}
		
		if (this.tamanho == this.array.length) {
			this.doubleArray();
		}
		
		this.array[this.tamanho] = element;
		this.tamanho++;
	}

	private void doubleArray() {
		// TODO Auto-generated method stub
		Livros[] arrayTemp = (Livros[]) new Object[this.tamanho * 2];
		
		for (int i = 0; i < this.tamanho; i++) {
			arrayTemp[i] = this.array[i];
		}
		
		this.array = arrayTemp;
	}
		
	}
	

