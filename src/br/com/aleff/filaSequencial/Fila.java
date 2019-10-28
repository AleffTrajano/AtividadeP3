package br.com.aleff.filaSequencial;

public class Fila <Livros>{
	private final int TAMANHO_iNICIAL = 3;
	private Livros[] array = (Livros[]) new Object[TAMANHO_iNICIAL];	
	private int tamanho;
	
	public void insert(Livros element) {
		if (element == null) {
			throw new IllegalArgumentException();
		}
		
		if (this.tamanho == this.array.length) {
			this.doubleArray();
		}
		
		this.array[this.tamanho] = element;
		this.tamanho++;
	}

	public Livros remove() throws QueueEmptyException {
		if (isEmpty()) {
			throw new QueueEmptyException();
		}
		
		Livros removed = this.array[0];
		
		if (this.tamanho == 1) {
			this.array[0] = null;
		} else {
			for (int i = 0; i < this.tamanho - 1; i++) {
				this.array[i] = this.array[i + 1];
			}
		}
		
		this.tamanho--;
		return removed;
	}

	public Livros front() throws QueueEmptyException {
		if (this.isEmpty()) {
			throw new QueueEmptyException();
		}
		
		return this.array[0];
	}

	public int tamanho() {
		return this.tamanho;
	}

	public boolean isEmpty() {
		return this.tamanho == 0 ? true : false;
	}

	private void doubleArray() {
		Livros[] temp = (Livros[]) new Object[this.tamanho * 2];
		for (int i = 0; i < this.tamanho; i++) {
			temp[i] = this.array[i];
		}
		this.array = temp;
	}

}



