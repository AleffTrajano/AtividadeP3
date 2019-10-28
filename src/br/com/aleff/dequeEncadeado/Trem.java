package br.com.aleff.dequeEncadeado;


public class Trem {
	
	
	private String vagao;
	private Trem proximo;
	
	public Trem(String vagao) {
		this.vagao = vagao;
	}
	

	public String getVagao() {
		return vagao;
	}
	public void setVagao(String vagao) {
		this.vagao = vagao;
	}
	public Trem getProximo() {
		return proximo;
	}
	public void setProximo(Trem proximo) {
		this.proximo = proximo;
	}
	
}
