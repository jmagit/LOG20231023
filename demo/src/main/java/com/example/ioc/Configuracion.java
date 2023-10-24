package com.example.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Configuracion {
	@Bean
	Servicio dameDB() {
		return new ServicioDB();
	}

	@Bean
	Servicio dameProxy() {
		return new ServicioProxy();
	}

	@Bean
	int version() {
		return 1;
	}

	@Bean
	String autor() {
		return "Yo mismo";
	}
	
	@Bean
	@Profile("default")
	Tonteria dameTonteria() {
		return new Tonteria() {
			
			@Override
			public void dime() {
				System.out.println("Soy una tonteria");
			}
		};
	}
	
	@Bean
	@Profile("test")
	Tonteria dameTonteriaGrande() {
		return new Tonteria() {
			
			@Override
			public void dime() {
				System.out.println("Soy una tonteria grande");
			}
		};
	}

}
