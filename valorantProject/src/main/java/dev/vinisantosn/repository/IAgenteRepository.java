package dev.vinisantosn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.vinisantosn.domain.Agente;

@Repository
public interface IAgenteRepository extends CrudRepository<Agente,Long>{
	
}