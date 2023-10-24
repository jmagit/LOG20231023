package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.domains.contracts.repositories.ActorRepository;
import com.example.domains.entities.Actor;
import com.example.ioc.Ejemplos;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Autowired
//	Ejemplos ejemplos;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Aplicacion arrancada");
//		ejemplos.run();
		ejemplosData();
	}
	
	@Autowired
	ActorRepository dao;
	
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
		dao.findByActorIdGreaterThanEqual(200).forEach(System.out::println);
	}

}
