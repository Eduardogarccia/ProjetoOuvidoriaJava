package br.com.ouvidoria;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ouvidoria {

	private String nome;

	ArrayList<Manifestacao> manifestacoes = new ArrayList<Manifestacao>();

	public void criarManifestacao(Manifestacao novaManifestacao) {
		manifestacoes.add(novaManifestacao);
	}

	public void listarManifestacoes() {
			
		if (manifestacoes.size() > 0) {
		
			String listagemManifestacoes = "";
			
			for (int i = 0; i < manifestacoes.size(); i++) {
				
				Manifestacao manifestacaoListada = manifestacoes.get(i);
				listagemManifestacoes = listagemManifestacoes + " - Código: " + (i+1) + "\n"
					+ " - Titulo: " + manifestacaoListada.getTitulo() + "\n" 
					+ " - Descrição: " + manifestacaoListada.getDescricao() + "\n" 
					+ " - Tipo: " + manifestacaoListada.getTipo() + "\n"
					+ " - Requerente: " + manifestacaoListada.getRequerente() + "\n" + "\n";
				}
			JOptionPane.showMessageDialog(null, "LISTAGEM DE MANIFESTAÇÕES: \n " + listagemManifestacoes + "\n");
			
		} else {
			JOptionPane.showInternalMessageDialog(null, "Não existem manifestações a serem listadas");
		}
	}

	public Ouvidoria(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
    ArrayList<Manifestacao> reclamacoes = new ArrayList<Manifestacao>();
    
    public void criarReclamacao(Manifestacao novaReclamacao) {
		reclamacoes.add(novaReclamacao);
	}
    
    public void listarReclamacoes() {
		
		if (reclamacoes.size() > 0) {
		
			String listagemReclamacoes = "";
			
			for (int i = 0; i < reclamacoes.size(); i++) {
				
				Manifestacao reclamacaoListada = reclamacoes.get(i);
				listagemReclamacoes = listagemReclamacoes + " - Código: " + (i+1) + "\n"
					+ " - Titulo: " + reclamacaoListada.getTitulo() + "\n" 
					+ " - Descrição: " + reclamacaoListada.getDescricao() + "\n" 
					+ " - Tipo: " + reclamacaoListada.getTipo() + "\n"
					+ " - Requerente: " + reclamacaoListada.getRequerente() + "\n" + "\n";
				}
			JOptionPane.showMessageDialog(null, "LISTAGEM DE MANIFESTAÇÕES: \n " + listagemReclamacoes + "\n");
			
		} else {
			JOptionPane.showInternalMessageDialog(null, "Não existem reclamações a serem listadas");
		}
	}
    
    ArrayList<Manifestacao> sugestoes = new ArrayList<Manifestacao>();
    
    public void criarSugestao(Manifestacao novaSugestao) {
		sugestoes.add(novaSugestao);
	}
    
    public void listarSugestoes() {
		
		if (sugestoes.size() > 0) {
		
			String listagemSugestoes = "";
			
			for (int i = 0; i < sugestoes.size(); i++) {
				
				Manifestacao sugestaoListada = sugestoes.get(i);
				listagemSugestoes = listagemSugestoes + " - Código: " + (i+1) + "\n"
					+ " - Titulo: " + sugestaoListada.getTitulo() + "\n" 
					+ " - Descrição: " + sugestaoListada.getDescricao() + "\n" 
					+ " - Tipo: " + sugestaoListada.getTipo() + "\n"
					+ " - Requerente: " + sugestaoListada.getRequerente() + "\n" + "\n";
				}
			JOptionPane.showMessageDialog(null, "LISTAGEM DE MANIFESTAÇÕES: \n " + listagemSugestoes + "\n");
			
		} else {
			JOptionPane.showInternalMessageDialog(null, "Não existem sugestões a serem listadas");
		}
	}
    
    ArrayList<Manifestacao> elogios = new ArrayList<Manifestacao>();
    
    public void criarElogio(Manifestacao novoElogio) {
    	elogios.add(novoElogio);
    }
    
    public void listarElogios() {
    	
    	if (elogios.size() > 0) {
    		
    		String listagemElogios = "";
    		
    		for (int i = 0; i < elogios.size(); i++) {
    			
    			Manifestacao elogioListado = elogios.get(i);
    			listagemElogios = listagemElogios + " - Código: " + (i+1) + "\n"
    					+ " - Titulo: " + elogioListado.getTitulo() + "\n" 
    					+ " - Descrição: " + elogioListado.getDescricao() + "\n" 
    					+ " - Tipo: " + elogioListado.getTipo() + "\n"
    					+ " - Requerente: " + elogioListado.getRequerente() + "\n" + "\n";
    		}
    		JOptionPane.showMessageDialog(null, "LISTAGEM DE MANIFESTAÇÕES: \n " + listagemElogios + "\n");
    		
    	} else {
    		JOptionPane.showInternalMessageDialog(null, "Não existem elogios a serem listados");
    	}
    }
    
    public Manifestacao pesquisarCodigo(int codigo) {
		
		Manifestacao manifestacaoPesquisada = null;
		
		if (codigo <= manifestacoes.size())	{	
			manifestacaoPesquisada = manifestacoes.get(codigo - 1);
			
		} else {
			JOptionPane.showInternalMessageDialog(null, "O código pesquisado nao existe.");
		}
		return manifestacaoPesquisada;

}
}
