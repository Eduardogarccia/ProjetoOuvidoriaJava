package br.com.ouvidoria.model;

import javax.persistence.Entity;

@Entity 
public class Elogio extends Manifestacao{

	public Elogio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Elogio(String titulo, String descricao, String tipo, String requerente) {
		super(titulo, descricao, tipo, requerente);
		// TODO Auto-generated constructor stub
	}
	
	

}
