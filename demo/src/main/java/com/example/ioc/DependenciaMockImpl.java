package com.example.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("old")
public class DependenciaMockImpl implements Dependencia {
	@Override
	public String dime() { return "Soy una simulacion de dependencia"; }
}
