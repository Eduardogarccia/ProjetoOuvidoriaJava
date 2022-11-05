package br.com.ouvidoria;

import javax.swing.JOptionPane;

public class AplicativoOuvidoriaFacisa {

	public static void main(String[] args) {

		Ouvidoria ouvidoriaFacisa = new Ouvidoria("Ouvidoria Facisa");
		int opcao = 0;

		while (opcao != 7) {

			String respostaString = JOptionPane.showInputDialog("1) Criar manifestação \r\n" 
							+ "2) Listar todas as manifestacoes \r\n"
							+ "3) Listar todas as sugestoes \r\n" 
							+ "4) Listar todas as reclamacoes \r\n"
							+ "5) Listar todos os elogios \r\n" 
							+ "6) Pesquisar protocolo por numero \r\n" 
							+ "7) Sair");
			opcao = Integer.parseInt(respostaString);

			if (opcao == 1) {

				String requerente = JOptionPane.showInputDialog("Digite o seu nome");
				
				String tipoManifestacaoStr = JOptionPane.showInputDialog("Digite o tipo da sua manifestação: \r\n"
						+ "Digite 'R' para fazer uma reclamação \r\n" 
						+ "Digite 'S' para fazer uma sugestão \r\n" 
						+ "Digite 'E' para fazer um elogio");
				
				TipoManifestacao tipoManifestacao = null;
				
				if (tipoManifestacaoStr.equalsIgnoreCase("R")) {
					tipoManifestacao = TipoManifestacao.RECLAMACAO;
				} else if (tipoManifestacaoStr.equalsIgnoreCase("S")) {
					tipoManifestacao = TipoManifestacao.SUGESTAO;
				} else if (tipoManifestacaoStr.equalsIgnoreCase("E")) {
					tipoManifestacao = TipoManifestacao.ELOGIO;
				} else {
					tipoManifestacao = TipoManifestacao.INDEFINIDO;
				}

				String titulo = JOptionPane.showInputDialog("Digite o título da sua manifestação");

				String descricao = JOptionPane.showInputDialog("Digite a descrição da sua manifestação");

				Manifestacao novaManifestacao = new Manifestacao(titulo, descricao, tipoManifestacao, requerente);
				ouvidoriaFacisa.criarManifestacao(novaManifestacao);
				
				if (tipoManifestacao.equals(TipoManifestacao.RECLAMACAO)) {
					ouvidoriaFacisa.criarReclamacao(novaManifestacao);
				} else if (tipoManifestacao.equals(TipoManifestacao.SUGESTAO)) {
					ouvidoriaFacisa.criarSugestao(novaManifestacao);
				} else if (tipoManifestacao.equals(TipoManifestacao.ELOGIO)) {
					ouvidoriaFacisa.criarElogio(novaManifestacao);
				}
				
				}
			
			else if (opcao == 2) {
				ouvidoriaFacisa.listarManifestacoes();
			}

			else if (opcao == 3) {
				ouvidoriaFacisa.listarSugestoes();
			}
			 
			else if (opcao == 4) {
				ouvidoriaFacisa.listarReclamacoes();
			} 
			
			else if (opcao == 5) {
				ouvidoriaFacisa.listarElogios();
			}
			
			else if (opcao == 6) {
				
				respostaString = JOptionPane.showInputDialog("Digite o código");
				int codigo = Integer.parseInt(respostaString);
				
				Manifestacao manifestacaoPesquisada = ouvidoriaFacisa.pesquisarCodigo(codigo);
				
				JOptionPane.showInternalMessageDialog(null, "A MANIFESTAÇÃO PESQUISADA FOI: \r\n" + "\r\n"
						+ "- Titulo: " + manifestacaoPesquisada.getTitulo() + "\r\n" 
						+ "- Descrição " + manifestacaoPesquisada.getDescricao() + "\r\n"  
						+ "- Tipo: " + manifestacaoPesquisada.getTipo() + "\r\n" 
						+ "- Requerente: " + manifestacaoPesquisada.getRequerente());
				
			}
		}
	}
} 
