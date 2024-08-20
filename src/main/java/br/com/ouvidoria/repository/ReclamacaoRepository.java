package br.com.ouvidoria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ouvidoria.model.Reclamacao;

@Repository
public interface ReclamacaoRepository extends CrudRepository<Reclamacao, Integer>{

}
