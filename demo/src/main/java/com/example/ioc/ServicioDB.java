package com.example.ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class ServicioDB implements Servicio {
	@Autowired
	Compartida comp;

	@Override
	public void save() {
		comp.sube();
		System.out.println("Guardo en la base de datos");
		System.out.println(comp);
	}
}
