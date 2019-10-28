package br.com.aleff.dequeSequencial;

import br.com.aleff.dequeEncadeado.DequeEmptyException;

public class Deque<T> {
	
		private int INITIAL_SIZE = 3;

		private T[] array = (T[]) new Object[INITIAL_SIZE];

		private int size;

		public void insertFirst(T element) {
			if (element == null) {
				throw new IllegalArgumentException();
			}

			if (this.size == this.array.length) {
				this.dobleArray();
			}

			for (int i = this.size; i > 0; i--) {
				this.array[i] = this.array[i - 1];
			}

			this.array[0] = element;
			this.size++;
		}

		public void removeFirst() throws DequeEmptyException {
			if (this.isEmpty()) {
				throw new DequeEmptyException();
			}

			this.array[0] = null;

			for (int i = 0; i < this.size - 1; i++) {
				this.array[i] = this.array[i + 1];
			}

			this.array[this.size - 1] = null;
			this.size--;
		}

		public void insertLast(T element) {
			if (element == null) {
				throw new IllegalArgumentException();
			}

			if (this.size == this.array.length) {
				this.dobleArray();
			}

			this.array[this.size] = element;
			this.size++;
		}

		public void removeLast() throws DequeEmptyException {
			if (this.isEmpty()) {
				throw new DequeEmptyException();
			}
			
			this.array[this.size - 1] = null;
			this.size--;
		}

		public T first() throws DequeEmptyException {
			if (this.isEmpty()) {
				throw new DequeEmptyException();
			}
			
			return this.array[0];
		}

		public T last() throws DequeEmptyException {
			if (this.isEmpty()) {
				throw new DequeEmptyException();
			}
			
			return this.array[this.size - 1];
		}

		public int size() {
			return size;
		}

		private boolean isEmpty() {
			return this.size == 0;
		}

		private void dobleArray() {
			T[] temp = (T[]) new Object[this.size * 2];
			
			for (int i = 0; i < this.size; i++) {
				temp[i] = this.array[i];
			}
			
			this.array = temp;
		}

	}


