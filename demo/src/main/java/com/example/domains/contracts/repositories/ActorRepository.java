package com.example.domains.contracts.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.domains.entities.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
	List<Actor> findTop5ByFirstNameStartingWithOrderByLastNameDesc(String prefijo);
	List<Actor> findTop5ByFirstNameStartingWith(String prefijo, Sort orderBy);
	
	List<Actor> findByActorIdGreaterThanEqual(int idInicial);
	@Query(value = "from Actor a where a.actorId >= ?1")
	List<Actor> findNovedadesByJPQL(int idInicial);
	@Query(value = "select * from actor where actor_id >= ?1", nativeQuery = true)
	List<Actor> findNovedadesBySQL(int idInicial);
}
