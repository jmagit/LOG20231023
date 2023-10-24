package com.example.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Ejemplos {
	private Dependencia dep;
	
	@Autowired
	Servicio dameProxy;
	
	@Autowired
	Servicio dameDB;
	
	@Autowired(required = false)
	Tonteria tonteria;
	
	@Value("${mi.valor:(sin valor)}")
	String config;
	
	public Ejemplos(@Qualifier("new") Dependencia dep) {
		this.dep = dep;
	}

//	@PostConstruct
//	void init() {
//		dameDB.save();
//	
//	}

	public void run() {
		System.out.println("Soy el ejemplo");
		System.out.println(dep.dime());
		dameProxy.save();
		dameDB.save();
		System.out.println(dep.dime());
		if(tonteria != null)
			tonteria.dime();
		else {
			System.out.println("No hay tonteria");
		}
		System.out.println("Valor: " + config);
	}
}
