package br.com.ouvidoria;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.ouvidoria.model.Elogio;
import br.com.ouvidoria.model.Manifestacao;
import br.com.ouvidoria.model.Reclamacao;
import br.com.ouvidoria.model.Sugestao;
import br.com.ouvidoria.repository.ElogioRepository;
import br.com.ouvidoria.repository.ManifestacaoRepository;
import br.com.ouvidoria.repository.ReclamacaoRepository;
import br.com.ouvidoria.repository.SugestaoRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ManifestacaoRepository manifestacaoRepository;

	@Autowired
	private ReclamacaoRepository reclamacaoRepository;

	@Autowired
	private SugestaoRepository sugestaoRepository;

	@Autowired
	private ElogioRepository elogioRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		int opcao = 0;

		while (opcao != 4) {

			System.out.println("1) Criar manifestação \r\n" + "2) Listar todas as manifestacoes \r\n"
					+ "3) Pesquisar protocolo por numero \r\n" + "4) Sair");
			Scanner scanner = new Scanner(System.in);
			String respostaString = scanner.next();
			opcao = Integer.parseInt(respostaString);

			if (opcao == 1) {

				System.out.println("Digite o seu nome");
				String requerente = scanner.next();

				System.out
						.println("Digite o tipo da sua manifestação: \r\n" + "Digite '1' para fazer uma reclamação \r\n"
								+ "Digite '2' para fazer uma sugestão \r\n" + "Digite '3' para fazer um elogio");
				String respostaString2 = scanner.next();
				int tipo = Integer.parseInt(respostaString2);

				String tipo3 = "";

				if (tipo == 1) {
					tipo3 = "reclamação";
				} else if (tipo == 2) {
					tipo3 = "sugestão";
				} else if (tipo == 3) {
					tipo3 = "elogio";
				}

				System.out.println("Digite o título da sua manifestação");
				String titulo = scanner.next();

				System.out.println("Digite a descrição da sua manifestação");
				String descricao = scanner.next();

				Manifestacao novaManifestacao = new Manifestacao(titulo, descricao, tipo3, requerente);
				manifestacaoRepository.save(novaManifestacao);

				if (tipo3 == "reclamação") {
					Reclamacao novaReclamacao = new Reclamacao(titulo, descricao, tipo3, requerente);
					reclamacaoRepository.save(novaReclamacao);
				} else if (tipo3 == "sugestão") {
					Sugestao novaSugestao = new Sugestao(titulo, descricao, tipo3, requerente);
					sugestaoRepository.save(novaSugestao);
				} else if (tipo3 == "elogio") {
					Elogio novoElogio = new Elogio(titulo, descricao, tipo3, requerente);
					elogioRepository.save(novoElogio);
				}

			} else if (opcao == 2) {

				ArrayList<Manifestacao> manifestacoes = (ArrayList<Manifestacao>) manifestacaoRepository.findAll();

				for (Manifestacao manifestacaoExistente : manifestacoes) {

					System.out.println(" - Titulo: " + manifestacaoExistente.getTitulo() + " - Descrição: "
							+ manifestacaoExistente.getDescricao() + " - Tipo: " + manifestacaoExistente.getTipo()
							+ " - Requerente: " + manifestacaoExistente.getRequerente());

				}
			} else if (opcao == 3) {

				Optional<Manifestacao> retorno = manifestacaoRepository.findById(5);

				if (retorno.isPresent()) {

					Manifestacao manifestacaoBuscada = retorno.get();

					System.out.println(" - Titulo: " + manifestacaoBuscada.getTitulo() + " - Descrição: "
							+ manifestacaoBuscada.getDescricao() + " - Tipo: " + manifestacaoBuscada.getTipo()
							+ " - Requerente: " + manifestacaoBuscada.getRequerente());

				}
			}
		}
	}
}
