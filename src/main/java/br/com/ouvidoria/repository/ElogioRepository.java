package br.com.ouvidoria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ouvidoria.model.Elogio;

@Repository
public interface ElogioRepository extends CrudRepository<Elogio, Integer>{

}
