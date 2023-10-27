package com.example.domains.contracts.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.domains.entities.Film;

@RepositoryRestResource(path="peliculas", itemResourceRel="pelicula", collectionResourceRel="peliculas")
public interface PeliculasRespository extends JpaRepository<Film, Integer> {
	@RestResource(path = "cortos")
	List<Film> findByLengthLessThan(int max);
	
	@Override
	@RestResource(exported = false)
	void deleteById(Integer id);
}
