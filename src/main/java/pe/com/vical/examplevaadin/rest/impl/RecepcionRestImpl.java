package pe.com.vical.examplevaadin.rest.impl;

import org.springframework.stereotype.Component;

import pe.com.vical.examplevaadin.rest.IRecepcionRest;

@Component
public class RecepcionRestImpl implements IRecepcionRest {

	@Override
	public String verificarService(String argumento) {
		return "OK";
	}

}
