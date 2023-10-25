package com.example.domains.contracts.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.domains.entities.Actor;
import com.example.domains.entities.dtos.ActorDTO;
import com.example.domains.entities.dtos.ActorShort;

public interface ActorRepository extends JpaRepository<Actor, Integer>, JpaSpecificationExecutor<Actor> {
	List<Actor> findTop5ByFirstNameStartingWithOrderByLastNameDesc(String prefijo);
	List<Actor> findTop5ByFirstNameStartingWith(String prefijo, Sort orderBy);
	List<Actor> findTop5ByFirstNameStartingWith(String prefijo);
	
	List<Actor> findByActorIdGreaterThanEqual(int idInicial);
	@Query(value = "from Actor a where a.actorId >= :id")
	List<Actor> findNovedadesByJPQL(@Param("id") int idInicial);
	@Query(value = "select * from actor where actor_id >= ?1", nativeQuery = true)
	List<Actor> findNovedadesBySQL(int idInicial);
	
	List<ActorDTO> readByActorIdGreaterThanEqual(int idInicial);
	List<ActorShort> queryByActorIdGreaterThanEqual(int idInicial);
	<T> List<T> findByActorIdGreaterThanEqual(int idInicial, Class<T> tipo);

}
