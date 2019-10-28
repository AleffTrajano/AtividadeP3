package br.com.aleff.dequeEncadeado;


public class Deque {
	

		private Trem first;
		private int size;
		
		public Deque() {
		}
		
		public Deque(Trem trem) {
			this.tremNull(trem);
			this.first = trem;
			this.size++;
		}
		
		private void tremNull(Trem trem) {
			// TODO Auto-generated method stub
			
		}
		
		
		public void inserirFront(Trem trem) {
			this.tremNull(trem);
			if (size == 0) {
				this.first = trem;
				this.size++;
			} else {
				trem.setProximo(this.first);
				this.first = trem;
				this.size++;
			}

		}

		public void deleteFront() throws DequeEmptyException {
			if (this.size == 0) {
				throw new DequeEmptyException();
			}
			Trem temp = this.first;
			this.first = this.first.getProximo();
			temp.setProximo(null);
			temp = null;
			this.size--;
		}

		
		public void insertLast(Trem trem) {
			this.TremNull(trem);
			if (this.size == 0) {
				this.first = trem;
				this.size++;
			} else {
				Trem temp = this.first;
				while (temp.getProximo() != null) {
					temp = temp.getProximo();
				}
				temp.setProximo(trem);
				this.size++;
				temp = null;
			}
		}

		
		public void removeLast() throws DequeEmptyException {
			if (this.size == 0) {
				throw new DequeEmptyException();
			}
			Trem temp = this.first;
			if (this.size == 1) {
				this.first = null;
			} else {
				while (temp.getProximo().getProximo() != null) {
					temp = temp.getProximo();
				}
			}
			temp.setProximo(null);
			temp = null;
			this.size--;
		}

		
		public Trem getFirst() {
			return first;
		}

		
		public Trem getLast() {
			Trem temp = this.first;
			if (this.size != 0) {
				while (temp.getProximo() != null) {
					temp = temp.getProximo();
				}
			}
			return temp;
		}

		
		public int getSize() {
			return size;
		}

		private void TremNull(Trem trem) {
			if (trem == null) {
				throw new IllegalArgumentException();
			}
		}
		
	}


