package com.example.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ejemplos {
	private Dependencia dep;
	
	@Autowired
	Servicio dameProxy;
	
	@Autowired
	Servicio dameDB;
	
	public Ejemplos(@Qualifier("new") Dependencia dep) {
		this.dep = dep;
	}


	public void run() {
		System.out.println("Soy el ejemplo");
		System.out.println(dep.dime());
		dameProxy.save();
		dameDB.save();
	}
}
