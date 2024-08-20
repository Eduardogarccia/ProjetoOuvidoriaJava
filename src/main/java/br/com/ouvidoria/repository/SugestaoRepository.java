package br.com.ouvidoria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ouvidoria.model.Sugestao;

@Repository
public interface SugestaoRepository extends CrudRepository<Sugestao, Integer>{

}
