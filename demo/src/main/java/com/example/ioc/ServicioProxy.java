package com.example.ioc;

public class ServicioProxy implements Servicio {
	@Override
	public void save() {
		System.out.println("Guardo en remoto");
	}
}
