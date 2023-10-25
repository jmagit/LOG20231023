package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.domains.contracts.repositories.ActorRepository;
import com.example.domains.contracts.services.ActorService;
import com.example.domains.entities.Actor;
import com.example.domains.entities.dtos.ActorDTO;
import com.example.domains.entities.dtos.ActorShort;
import com.example.exceptions.DuplicateKeyException;
import com.example.exceptions.InvalidDataException;
import com.example.exceptions.NotFoundException;
import com.example.ioc.Ejemplos;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Autowired
//	Ejemplos ejemplos;
	
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		System.out.println("Aplicacion arrancada");
//		ejemplos.run();
		ejemplosData();
	}
	
//	@Autowired
//	ActorRepository dao;
	
	@Autowired
	ActorService srv;
	
	void ejemplosData() {
//		var a = new Actor(0, "Pepito", "Grillo");
//		dao.save(a);
//		var item = dao.findById(201);
//		if(item.isPresent()) {
//			var a = item.get();
//			a.setFirstName(a.getFirstName().toUpperCase());
//			dao.save(a);
//		}
//		dao.deleteById(201);
//		dao.findAll().forEach(System.out::println);
//		dao.findTop5ByFirstNameStartingWithOrderByLastNameDesc("P").forEach(System.out::println);
//		dao.findTop5ByFirstNameStartingWith("P", Sort.by("firstName","lastName").descending()).forEach(System.out::println);
//		dao.findByActorIdGreaterThanEqual(200).forEach(System.out::println);
//		dao.findNovedadesByJPQL(200).forEach(System.out::println);
//		dao.findNovedadesBySQL(200).forEach(System.out::println);
//		dao.findAll((root, query, builder) -> builder.greaterThanOrEqualTo(root.get("actorId"), 200))
//			.forEach(System.out::println);
//		dao.findAll((root, query, builder) -> builder.lessThan(root.get("actorId"), 10))
//		.forEach(System.out::println);
//		dao.findAll(PageRequest.of(1, 10, Sort.by("firstName","lastName"))).forEach(System.out::println);
//		var item = dao.findById(1);
//		if(item.isPresent()) {
//			var a = item.get();
//			System.out.println(a);
//			a.getFilmActors().forEach(f->System.out.println(f.getFilm().getTitle()));
//		}
//		var a = new Actor(0, null, "4g");
//		if(a.isInvalid())
//			System.err.println(a.getErrorsMessage());
//		else
//			dao.save(a);
//		dao.findByActorIdGreaterThanEqual(200).forEach(System.out::println);
////		dao.findByActorIdGreaterThanEqual(200)
////			.forEach(f->System.out.println(ActorDTO.from(f)));
////		dao.readByActorIdGreaterThanEqual(200).forEach(System.out::println);
////		dao.queryByActorIdGreaterThanEqual(200)
////			.forEach(f->System.out.println(f.getId() + " " + f.getNombre()));
//		dao.findByActorIdGreaterThanEqual(200, ActorDTO.class).forEach(System.out::println);
//		dao.findByActorIdGreaterThanEqual(200, ActorShort.class)
//			.forEach(f->System.out.println(f.getId() + " " + f.getNombre()));
		
		srv.getByProjection(ActorShort.class)
			.forEach(f->System.out.println(f.getId() + " " + f.getNombre()));
		try {
			srv.modify(new Actor(11110, "PPPPPP", "4g"));
			srv.add(new Actor(0, null, "4g"));
		} catch (DuplicateKeyException | InvalidDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Transactional
	void operacion() {
		
	}
}
