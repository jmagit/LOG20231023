package com.example.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
@Qualifier("new")
public class DependenciaImpl implements Dependencia {
	@Override
	public String dime() { return "Soy una dependencia"; }
}
