package com.example.ioc;

import org.springframework.stereotype.Component;

@Component
public class Ejemplos {
	private Dependencia dep;
	
	
	public Ejemplos(Dependencia dep) {
		this.dep = dep;
	}


	public void run() {
		System.out.println("Soy el ejemplo");
		System.out.println(dep.dime());
	}
}
