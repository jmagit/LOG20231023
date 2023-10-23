package com.example.ioc;

import org.springframework.stereotype.Service;

@Service
public class DependenciaMockImpl implements Dependencia {
	@Override
	public String dime() { return "Soy una simulacion de dependencia"; }
}
