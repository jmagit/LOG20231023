package com.example.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

}
