package br.com.ouvidoria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ouvidoria.model.Manifestacao;

@Repository
public interface ManifestacaoRepository extends CrudRepository<Manifestacao, Integer>{

}
