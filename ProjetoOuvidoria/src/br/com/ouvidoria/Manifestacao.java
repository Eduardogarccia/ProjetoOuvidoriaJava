package br.com.ouvidoria;

public class Manifestacao {

	private String titulo;
	private String descricao;
	private TipoManifestacao tipo;
	private String requerente;

	public Manifestacao(String titulo, String descricao, TipoManifestacao tipo, String requerente) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.tipo = tipo;
		this.requerente = requerente;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoManifestacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoManifestacao tipo) {
		this.tipo = tipo;
	}

	public String getRequerente() {
		return requerente;
	}

	public void setRequerente(String requerente) {
		this.requerente = requerente;
	}
	
	

}
