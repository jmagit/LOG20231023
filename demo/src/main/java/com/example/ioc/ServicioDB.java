package com.example.ioc;

public class ServicioDB implements Servicio {
	@Override
	public void save() {
		System.out.println("Guardo en la base de datos");
	}
}
