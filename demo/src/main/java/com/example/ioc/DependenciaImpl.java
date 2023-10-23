package com.example.ioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DependenciaImpl implements Dependencia {
	@Override
	public String dime() { return "Soy una dependencia"; }
}
