package br.com.aleff.pilhaencadeada;


public class No {
	
		private No proximo;
		private String valor;
		
		
		public No (String valor) {
			this.valor=valor;
		}
		
		public No getProximo() {
			return proximo;
		}
		public void setProximo(No proximo) {
			this.proximo = proximo;
		}
		public String getValor() {
			return valor;
		}
		public void setValor(String valor) {
			this.valor = valor;
		}
		
		

	}


