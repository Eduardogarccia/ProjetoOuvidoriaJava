package br.com.ouvidoria.model;

import javax.persistence.Entity;

@Entity 
public class Sugestao extends Manifestacao{

	public Sugestao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sugestao(String titulo, String descricao, String tipo, String requerente) {
		super(titulo, descricao, tipo, requerente);
		// TODO Auto-generated constructor stub
	}

}
