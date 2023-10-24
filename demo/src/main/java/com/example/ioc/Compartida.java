package com.example.ioc;

import java.beans.ConstructorProperties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Compartida {
	private int version;
	private String autor;
	
	@ConstructorProperties({"version", "autor"})
	public Compartida(int version, String autor) {
		this.version = version;
		this.autor = autor;
	}

	public int getVersion() {
		return version;
	}

	public String getAutor() {
		return autor;
	}

	public void sube() {
		version++;
	}

	@Override
	public String toString() {
		return "Compartida [version=" + version + ", autor=" + autor + "]";
	}
	
	
}
