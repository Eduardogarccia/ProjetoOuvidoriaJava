package br.com.ouvidoria.model;

import javax.persistence.Entity;

@Entity 
public class Reclamacao extends Manifestacao{

	public Reclamacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reclamacao(String titulo, String descricao, String tipo, String requerente) {
		super(titulo, descricao, tipo, requerente);
		// TODO Auto-generated constructor stub
	}

}
